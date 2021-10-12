package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.Constants;
import jlg.jade.common.TwoComplementDecoder;
import jlg.jade.common.UnsignedNumericDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item160 extends FixedLengthAsterixData {

    private boolean rangeExceeded;
    private int groundSpeed;
    private double groundSpeedKnots;
    private double trackAngle;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.FOUR_BYTES.getValue();
    }

    public boolean isRangeExceeded() {
        return rangeExceeded;
    }

    public double getGroundSpeedKnots() {
        return groundSpeedKnots;
    }

    public double getTrackAngle() {
        return trackAngle;
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        BitSet firstOctetBits = BitSet.valueOf(new byte[]{input[offset]});

        final int RE_BIT_INDEX = 7;

        //decode RE
        rangeExceeded = firstOctetBits.get(RE_BIT_INDEX) ? true : false;

        //decode ground speed
        int firstOctetValueWithoutRE = Byte.toUnsignedInt(input[offset]);
        byte secondEctetValue = input[offset + 1];
        if (firstOctetBits.get(RE_BIT_INDEX)) {
            firstOctetValueWithoutRE -= 128;
        }

        decodeGroundSpeed(firstOctetValueWithoutRE, secondEctetValue);

        this.trackAngle = UnsignedNumericDecoder.decodeFromTwoBytes(input, offset + 2) * Constants.FROM_ASTERIX_MAGENTIC_HEADING_TO_DEGREES;

    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item160 - Ground Speed and Track Angle elements of Ground Vector";
    }

    private void decodeGroundSpeed(int firstOctetValueWithoutRE, byte secondEctetValue) {
        this.groundSpeed
                = firstOctetValueWithoutRE * 256
                + Byte.toUnsignedInt(secondEctetValue);
        appendItemDebugMsg("Ground Speed", groundSpeed);

        this.groundSpeedKnots = groundSpeed * Constants.FROM_ASTERIX_GROUND_SPEED_TO_KNOTS;;

    }

}
