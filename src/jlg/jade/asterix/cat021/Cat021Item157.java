package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.Constants;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item157 extends FixedLengthAsterixData {

    private boolean rangeExceeded;
    int geometricVerticalRate;
    double geometricVerticalRateFeet;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    public boolean isRangeExceeded() {
        return rangeExceeded;
    }

    public double getGeometricVerticalRateFeet() {
        return geometricVerticalRateFeet;
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        BitSet firstOctetBits = BitSet.valueOf(new byte[]{input[offset]});

        final int RE_BIT_INDEX = 7;

        //decode RE
        rangeExceeded = firstOctetBits.get(RE_BIT_INDEX) ? true : false;

        //decode geometric vertical rate
        byte firstOctetValueWithoutRE = input[offset];
        byte secondEctetValue = input[offset + 1];
        if (firstOctetBits.get(RE_BIT_INDEX)) {
            firstOctetValueWithoutRE -= 128;
        }

        decodeGeometricVerticalRate(firstOctetValueWithoutRE, secondEctetValue);
    }

    private void decodeGeometricVerticalRate(byte firstOctetValueWithoutRE, byte secondEctetValue) {
        this.geometricVerticalRate
                = firstOctetValueWithoutRE * 256
                + Byte.toUnsignedInt(secondEctetValue);
        appendItemDebugMsg("Geometric Vertical Rate", geometricVerticalRate);

        this.geometricVerticalRateFeet = geometricVerticalRate * Constants.FROM_ASTERIX_ALT_TO_FEET;

    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item155 - Geometric Vertical Rate";
    }
}
