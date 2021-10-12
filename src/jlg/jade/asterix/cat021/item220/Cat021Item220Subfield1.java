package jlg.jade.asterix.cat021.item220;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.UnsignedNumericDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item220Subfield1 extends FixedLengthAsterixData {

    private int windspeed;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.windspeed = UnsignedNumericDecoder.decodeFromTwoBytes(input, offset);
    }

    @Override
    protected boolean validate() {
        if (this.windspeed < 0 || this.windspeed > 300) {
            appendDebugMsg(
                    "Item is not valid. Range should be between 0 and 300. Wind Speed:" + this.windspeed);
            return false;
        }
        return true;
    }

    public int getWindspeed() {
        return this.windspeed;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item220Subfield1 - Wind Speed";
    }

}
