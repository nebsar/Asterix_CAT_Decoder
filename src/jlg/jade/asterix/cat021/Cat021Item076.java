package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item076 extends FixedLengthAsterixData {

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.FOUR_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        appendNotImplementedMsg();
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item076 - Time of Message Reception of Velocity–High Precision";
    }
    
}