package jlg.jade.asterix.cat021.item110;

import jlg.jade.asterix.DecodingNotImplemented;
import jlg.jade.asterix.RepeatableAsterixData;

/**
 *
 * @author beni.morgan
 */
class Cat021Item110Subfield2 extends RepeatableAsterixData {

    @Override
    protected int setRepeatableBlockSizeInBytes() {
        return 15;
    }

    @Override
    @DecodingNotImplemented(reason = "Item not needed yet")
    protected void decodeFromByteArray(byte[] input, int offset) {
        appendNotImplementedMsg();
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item110Subfield2 - Trajectory Intent Data";
    }
}
