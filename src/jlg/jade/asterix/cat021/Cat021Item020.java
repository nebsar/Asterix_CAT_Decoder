package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item020 extends FixedLengthAsterixData {

    private int ECATValue;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.ONE_BYTE.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        this.ECATValue = Byte.toUnsignedInt(input[offset]);

        appendItemDebugMsg("Emitter Category: ", this.ECATValue);
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item020 - Emitter Category";
    }

}
