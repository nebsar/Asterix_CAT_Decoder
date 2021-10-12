package jlg.jade.asterix.cat021.item220;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.TwoComplementDecoder;

/**
 *
 * @author beni.morgan
 */
class Cat021Item220Subfield3 extends FixedLengthAsterixData {

    private double temperature;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();

    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        this.temperature = TwoComplementDecoder.decodeFromTwoBytes(input, offset) * 0.25;

    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    protected boolean validate() {

        if (this.temperature < 100 || this.temperature > 100) {
            appendDebugMsg(
                    "Item is not valid. Range should be between -100 and 100. Temperature: " + this.temperature);
            return false;
        }

        return true;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item220Subfield3 - Temperature";
    }
}
