package jlg.jade.asterix.cat021;

import java.nio.ByteBuffer;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item015 extends FixedLengthAsterixData {

    private int serviceIdentification;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.ONE_BYTE.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.serviceIdentification = Byte.toUnsignedInt(input[offset]);

        appendItemDebugMsg("Service identification:", this.serviceIdentification);
    }

    @Override
    public byte[] encode() {
        byte[] itemAsByteArray = ByteBuffer.allocate(1).put((byte) this.serviceIdentification).array();

        return itemAsByteArray;
    }

    @Override
    protected boolean validate() {
        return true;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item015 - Service Identification";
    }

}
