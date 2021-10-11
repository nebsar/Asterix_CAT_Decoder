package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item146 extends FixedLengthAsterixData {

    private boolean SASValue;
    private int source;
    private String sourceString;
    private int selectedAltitude;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        BitSet firstOctetBits = BitSet.valueOf(new byte[]{input[offset]});

        final int SAS_BIT_INDEX = 7;
        final int SRC_BIT1_INDEX = 6;
        final int SRC_BIT0_INDEX = 5;

        this.SASValue = firstOctetBits.get(SAS_BIT_INDEX);

        decodeSource(SRC_BIT0_INDEX, SRC_BIT1_INDEX, firstOctetBits);

        byte firstOctetValueWithoutModes = input[offset];
        if (firstOctetBits.get(SAS_BIT_INDEX)) {
            firstOctetValueWithoutModes -= 128;
        }
        if (firstOctetBits.get(SRC_BIT1_INDEX)) {
            firstOctetValueWithoutModes -= 64;
        }
        if (firstOctetBits.get(SRC_BIT0_INDEX)) {
            firstOctetValueWithoutModes -= 32;
        }

        byte secondOctetByte = input[offset + 1];

        decodeAltitude(firstOctetValueWithoutModes, secondOctetByte);
    }

    public boolean isSASValue() {
        return SASValue;
    }

    public String getSourceString() {
        return sourceString;
    }

    public int getSelectedAltitude() {
        return selectedAltitude;
    }

    private String decodeSource(final int SRC_BIT0_INDEX, final int SRC_BIT1_INDEX, BitSet firstOctetBits) {

        int srcBit0Value = 0;
        int srcBit1Value = 0;

        if (firstOctetBits.get(SRC_BIT0_INDEX)) {
            srcBit0Value = 1;
        } else {
            srcBit0Value = 0;
        }

        if (firstOctetBits.get(SRC_BIT1_INDEX)) {
            srcBit1Value = 1;
        } else {
            srcBit1Value = 0;
        }

        this.source = srcBit1Value * 2 + srcBit0Value;

        switch (this.source) {
            case 0:
                return "Unknown";
            case 1:
                return "Aricraft Altitude (Holding Altitude)";
            case 2:
                return "FCU/MCP Selected Altitude";
            case 3:
                return "FMS Selected Altitude";
            default:
                return "Unknown";
        }

    }

    private int decodeAltitude(byte firstOctetValueWithoutModes, byte secondOctetBits) {
        //decode altitude

        this.selectedAltitude
                = firstOctetValueWithoutModes * 256
                + Byte.toUnsignedInt(secondOctetBits);
        appendItemDebugMsg("Selected Altitude (25 ft)", selectedAltitude);

        return this.selectedAltitude;
    }

    @Override
    protected boolean validate() {
        return getSelectedAltitudeInFeet() >= -1300 && getSelectedAltitudeInFeet() <= 100000;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item146 - Intermediate State Selected Altitude";
    }

    public int getSelectedAltitudeInFeet() {
        return selectedAltitude * 25;
    }

}
