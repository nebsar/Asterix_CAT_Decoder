package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.TwoComplementDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item165 extends FixedLengthAsterixData {

    private double trackAngleRate;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.trackAngleRate = TwoComplementDecoder.decodeFromTwoBytes(input, offset) * 0.03125;
        appendItemDebugMsg("Track Angle Rate", this.trackAngleRate);
    }

    public double getTrackAngleRate() {
        return this.trackAngleRate;

    }

    @Override
    protected boolean validate() {
        return getTrackAngleRate() <= 16.0d;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item165 - Track Angle Rate";
    }

}
