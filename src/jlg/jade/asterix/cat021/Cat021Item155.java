package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.Constants;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item155 extends FixedLengthAsterixData {

    private boolean rangeExceeded;
    int barometricVerticalRate;
    double barometricVerticalRateDecimal;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    public boolean isRangeExceeded() {
        return rangeExceeded;
    }

    public double getBarometricVerticalRateDecimal() {
        return barometricVerticalRateDecimal;
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        BitSet firstOctetBits = BitSet.valueOf(new byte[]{input[offset]});

        final int RE_BIT_INDEX = 7;

        //decode RE
        rangeExceeded = firstOctetBits.get(RE_BIT_INDEX) ? true : false;

        //decode barometric verticla rate
        byte firstOctetValueWithoutRE = input[offset];
        byte secondEctetValue = input[offset + 1];
        if (firstOctetBits.get(RE_BIT_INDEX)) {
            firstOctetValueWithoutRE -= 128;
        }

        decodeBarometricVerticalRate(firstOctetValueWithoutRE, secondEctetValue);
    }

    private void decodeBarometricVerticalRate(byte firstOctetValueWithoutRE, byte secondEctetValue) {
        this.barometricVerticalRate
                = firstOctetValueWithoutRE * 256
                + Byte.toUnsignedInt(secondEctetValue);
        appendItemDebugMsg("Barometric Vertical Rate", barometricVerticalRate);

        this.barometricVerticalRateDecimal = barometricVerticalRate * Constants.FROM_ASTERIX_ALT_TO_FEET;

    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item155 - Barometric Vertical Rate";
    }

}
