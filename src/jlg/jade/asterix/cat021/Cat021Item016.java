package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item016 extends FixedLengthAsterixData {

    private double RPValue;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.ONE_BYTE.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        this.RPValue = Byte.toUnsignedInt(input[offset]) * 0.5;//0.5 seconds converter
        
        appendItemDebugMsg("Service Management Report Period (seconds): ", this.RPValue);
    }

    public double getRPValue() {
        return RPValue;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item016 - Service Management Report Period (seconds)";
    }

}
