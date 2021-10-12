package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.Constants;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item150 extends FixedLengthAsterixData {

    int indicatedAirspeedOrMach;
    String airspeedType;
    int airspeed;
    double airspeedDecimal;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        BitSet firstOctetBits = BitSet.valueOf(new byte[]{input[offset]});

        final int IM_BIT_INDEX = 7;

        //decode IM
        indicatedAirspeedOrMach = firstOctetBits.get(IM_BIT_INDEX) ? 1 : 0;

        switch (indicatedAirspeedOrMach) {
            case 0:
                airspeedType = "IAS";
                break;
            case 1:
                airspeedType = "MACH";
                break;
        }

        //decode airspeed
        int firstOctetValueWithoutIM = Byte.toUnsignedInt(input[offset]);
        byte secondEctetValue = input[offset + 1];
        if (firstOctetBits.get(IM_BIT_INDEX)) {
            firstOctetValueWithoutIM -= 128;
        }

        decodeAirSpeed(firstOctetValueWithoutIM, secondEctetValue);

    }

    private void decodeAirSpeed(int firstOctetValueWithoutIM, byte secondOctetValue) {
        this.airspeed
                = firstOctetValueWithoutIM * 256
                + Byte.toUnsignedInt(secondOctetValue);

        switch (airspeedType) {
            case "IAS":
                airspeedDecimal = airspeed * Constants.IAS_CAT021;
            case "MACH":
                airspeedDecimal = airspeed * Constants.MACH_CAT021;
        }

        appendItemDebugMsg("Calculated Air Speed (Element of Air Vector)", getAirspeedDecimal());
    }

    public String getAirspeedType() {
        return this.airspeedType;
    }

    public double getAirspeedDecimal() {
        return this.airspeedDecimal;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item150 - Calculated Air Speed (Element of Air Vector)";
    }

}
