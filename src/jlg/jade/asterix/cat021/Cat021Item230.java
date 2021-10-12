package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.Constants;
import jlg.jade.common.TwoComplementDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item230 extends FixedLengthAsterixData {

    private double rollAngle;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        this.rollAngle = TwoComplementDecoder.decodeFromTwoBytes(input, offset) * Constants.FROM_ASTERIX_ROLL_ANGLE_TO_DEGREES;

    }

    public double getRollAngle() {
        return this.rollAngle;
    }

    @Override
    protected boolean validate() {

        if (this.rollAngle < -180 || this.rollAngle > 180) {

            appendDebugMsg("Value is invalid - Range should between -180 and 180 - Roll Angle: " + this.rollAngle);

            return false;
        }

        return true;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item230 - Roll Angle";
    }

}
