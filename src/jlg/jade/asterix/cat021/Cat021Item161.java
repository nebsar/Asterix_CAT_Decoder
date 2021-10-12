package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.UnsignedNumericDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item161 extends FixedLengthAsterixData {

    int trackNumber;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        this.trackNumber = UnsignedNumericDecoder.decodeFromTwoBytes(input, offset);

        appendItemDebugMsg("Track number", this.trackNumber);

    }

    @Override
    protected boolean validate() {
        if (this.trackNumber < 0 || this.trackNumber > 4095) {
            appendDebugMsg(
                    "Item is not valid. Range should be between 0 and 4095. Track number:" + this.trackNumber);
            return false;
        }
        return true;
    }   

    public int getTrackNumber() {
        return trackNumber;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item161 - Track Number";
    }

}
