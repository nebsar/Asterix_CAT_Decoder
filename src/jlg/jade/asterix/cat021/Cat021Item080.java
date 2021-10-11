package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.UnsignedNumericDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item080 extends FixedLengthAsterixData {

    private int aircraftAddress;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.THREE_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.aircraftAddress = UnsignedNumericDecoder.decodeFromThreeBytes(input, offset);

        appendItemDebugMsg("Target Address", this.aircraftAddress);
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item080 - Target Address";
    }

    public int getAircraftAddress() {
        return aircraftAddress;
    }
}
