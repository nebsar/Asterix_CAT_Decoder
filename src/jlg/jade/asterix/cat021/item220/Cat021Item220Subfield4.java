package jlg.jade.asterix.cat021.item220;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.UnsignedNumericDecoder;

/**
 *
 * @author beni.morgan
 */
class Cat021Item220Subfield4 extends FixedLengthAsterixData {

    private int turbulence;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.ONE_BYTE.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.turbulence = UnsignedNumericDecoder.decodeFromOneByte(input, offset);
    }

    public int getTurbulence() {
        return turbulence;
    }

    @Override
    protected boolean validate() {
        if (this.turbulence < 0 || this.turbulence > 15) {
            appendDebugMsg("Item is not valid. Range should be between 0 and 15. Wind Direction: " + this.turbulence);
            return false;
        }

        return true;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021ItemSubfiled4 - Turbulence";
    }

}
