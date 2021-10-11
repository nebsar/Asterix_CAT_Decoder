package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.Constants;
import jlg.jade.common.TwoComplementDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item140 extends FixedLengthAsterixData {

    private int geometricAltitude;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.geometricAltitude = TwoComplementDecoder.decodeFromTwoBytes(input, offset);
        appendItemDebugMsg("Geometric altitude", this.geometricAltitude);
    }

    @Override
    protected boolean validate() {
        int minAllowedVal = -240;   // -1500 ft
        int maxAllowedVal = 24000;  // 150000 ft

        if (geometricAltitude >= minAllowedVal && geometricAltitude <= maxAllowedVal) {
            return true;
        }
        appendDebugMsg("Subfield is invalid (not between -240 (-1500ft) and 24000 (150000ft)");
        appendNewLine();
        return false;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item140 - Geometric Altitude";
    }

    /**
     * Set the geometric altitude, expressed as 6.25 ft
     *
     * @return
     */
    public int getGeometricAltitude() {
        return geometricAltitude;
    }

    /**
     * @return The geometric altitude expressed in feet. The result is converted
     * to an integer, so a slight loss of precision will take place
     */
    public int getGeometricAltitudeFeet() {
        return (int) (geometricAltitude * Constants.FROM_ASTERIX_ALTITUDE_TO_FT);
    }
}
