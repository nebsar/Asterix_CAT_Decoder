package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.TwoComplementDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item145 extends FixedLengthAsterixData {

    private int flightLevel;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        this.flightLevel = TwoComplementDecoder.decodeFromTwoBytes(input, offset);
        appendItemDebugMsg("Geometric altitude", this.flightLevel);

    }

    @Override
    protected boolean validate() {
        int minAllowedVal = -15;   // -15 FL
        int maxAllowedVal = 1500;  // 1500 FL

        if (getFlightLevelCorrected() >= minAllowedVal && getFlightLevelCorrected() <= maxAllowedVal) {
            return true;
        }
        appendDebugMsg("Subfield is invalid (not between -15 FL and 1500 FL)");
        appendNewLine();
        return false;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item145 - Flight Level";
    }

    public int getFlightLevel() {
        return this.flightLevel;
    }

    public int getFlightLevelCorrected() {
        return (int) (this.flightLevel * .25);

    }

}
