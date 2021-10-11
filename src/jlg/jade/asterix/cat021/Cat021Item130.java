package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.Constants;
import jlg.jade.common.TwoComplementDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item130 extends FixedLengthAsterixData {

    private int latitudeWgs84;
    private int longitudeWgs84;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.SIX_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.latitudeWgs84 = TwoComplementDecoder.decodeFromThreeBytes(input, offset);
        this.longitudeWgs84 = TwoComplementDecoder.decodeFromThreeBytes(input, offset + 3);

        appendItemDebugMsg("Latitude in WGS 84", this.latitudeWgs84);
        appendItemDebugMsg("Longitude in WGS 84", this.longitudeWgs84);
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item130 - Position in WGS-84 Co-ordinates";
    }

    @Override
    protected boolean validate() {
        if (getLatitudeDecimalWgs84() < -90 || getLatitudeDecimalWgs84() > 90) {
            appendDebugMsg("Item is not valid. Latitude is not within -90,90 range. Latitude: " + getLatitudeDecimalWgs84());
            return false;
        }

        if (getLongitutdeDecimalWgs84() < -180 || getLongitutdeDecimalWgs84() > 180) {
            appendDebugMsg("Item is not valid. Latitude is not within -180,180 range. Longitude: " + getLongitutdeDecimalWgs84());
            return false;
        }

        return true;
    }

    public int getLatitudeWgs84() {
        return this.latitudeWgs84;
    }

    public int getLongitudeWgs84() {
        return this.longitudeWgs84;
    }

    /**
     * Calculate the decimal value of the WSG84 latitude according the Asterix
     * specification
     */
    public double getLatitudeDecimalWgs84() {
        return this.latitudeWgs84 * Constants.LAT_LONG_WGS_PRECISION_CAT021_CAT034_CAT048;
    }

    /**
     * Calculate the decimal value of WSG84 longitude according the Asterix
     * specification
     */
    public double getLongitutdeDecimalWgs84() {
        return this.longitudeWgs84 * Constants.LAT_LONG_WGS_PRECISION_CAT021_CAT034_CAT048;
    }

}
