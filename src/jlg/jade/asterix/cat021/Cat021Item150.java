package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item150 extends FixedLengthAsterixData {
    
    boolean IM;
    String airspeedType;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item150 - Calculated Air Speed (Element of Air Vector)";
    }
    
}
