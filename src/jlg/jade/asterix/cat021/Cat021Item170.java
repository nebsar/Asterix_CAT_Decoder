package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.IA5Decoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item170 extends FixedLengthAsterixData {

    private String targetID;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.SIX_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.targetID = IA5Decoder.decodeFromSixBytes(input, offset);
        appendItemDebugMsg("Target Identification", this.targetID);
    }

    public String getTargetID() {
        return this.targetID;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item165 - Track Angle Rate";
    }

}
