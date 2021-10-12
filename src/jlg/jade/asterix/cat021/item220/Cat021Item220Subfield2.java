package jlg.jade.asterix.cat021.item220;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.UnsignedNumericDecoder;

/**
 *
 * @author beni.morgan
 */
class Cat021Item220Subfield2 extends FixedLengthAsterixData {

    private double windDirection;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();

    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        this.windDirection = UnsignedNumericDecoder.decodeFromTwoBytes(input, offset) * 0.25;

    }

    public double getTemperature() {
        return windDirection;
    }

    @Override
    protected boolean validate() {

        if (this.windDirection < 1 || this.windDirection > 360) {
             appendDebugMsg(
                    "Item is not valid. Range should be between 1 and 360. Wind Direction: " + this.windDirection);
            return false;
        }

        return true;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item220Subfield2 - Wind Direction";
    }

}
