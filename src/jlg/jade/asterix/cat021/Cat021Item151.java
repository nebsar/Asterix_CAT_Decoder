package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item151 extends FixedLengthAsterixData {

    private boolean rangeExceeded;
    int trueAirspeed;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    public boolean isRangeExceeded() {
        return rangeExceeded;
    }

    public int getTrueAirspeed() {
        return trueAirspeed;
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        BitSet firstOctetBits = BitSet.valueOf(new byte[]{input[offset]});

        final int RE_BIT_INDEX = 7;

        //decode RE
        rangeExceeded = firstOctetBits.get(RE_BIT_INDEX) ? true : false;

        //decode airspeed
        int firstOctetValueWithoutRE = Byte.toUnsignedInt(input[offset]);
        byte secondEctetValue = input[offset + 1];
        if (firstOctetBits.get(RE_BIT_INDEX)) {
            firstOctetValueWithoutRE -= 128;
        }

        decodeTrueAirspeed(firstOctetValueWithoutRE, secondEctetValue);
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item151 - True Air Speed (Knots)";
    }

    private void decodeTrueAirspeed(int firstOctetValueWithoutRE, byte secondEctetValue) {
        this.trueAirspeed
                = firstOctetValueWithoutRE * 256
                + Byte.toUnsignedInt(secondEctetValue);
        appendItemDebugMsg("True Air Speed", trueAirspeed);

    }

}
