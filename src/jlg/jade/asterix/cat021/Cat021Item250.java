package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.DecodingNotImplemented;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.asterix.RepeatableAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item250 extends RepeatableAsterixData {

    @Override
    protected int setRepeatableBlockSizeInBytes() {
        return AsterixItemLength.EIGHT_BYTES.getValue();
    }

    @Override
    @DecodingNotImplemented(reason = "Item not needed yet")
    protected void decodeFromByteArray(byte[] input, int offset) {
        appendNotImplementedMsg();
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item250 - Mode S MB Data";
    }

}
