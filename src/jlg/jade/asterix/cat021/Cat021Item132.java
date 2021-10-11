package jlg.jade.asterix.cat021;

import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item132 extends FixedLengthAsterixData {

    private int MAMValue;

    @Override
    protected int setSizeInBytes() {
        return 1;
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.MAMValue = Byte.toUnsignedInt(input[offset]);

        appendItemDebugMsg("MAM:", this.MAMValue);
    }

    public int getMAMValue() {
        return this.MAMValue;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item132 - Message Amplitude";
    }

}
