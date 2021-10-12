package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.UnsignedNumericDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item400 extends FixedLengthAsterixData {

    private int receiverID;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.ONE_BYTE.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.receiverID = UnsignedNumericDecoder.decodeFromOneByte(input, offset);

        appendItemDebugMsg("Receiver ID: ", this.receiverID);
    }

    public int getReceiverID() {
        return receiverID;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item400 - Receiver ID";
    }

}
