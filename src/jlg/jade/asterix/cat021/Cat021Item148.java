package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item148 extends FixedLengthAsterixData {

    private boolean manageVerticalModeActive;
    private boolean altitudeHoldActive;
    private boolean approachModeActive;
    private int selectedAltitude;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        BitSet firstOctetBits = BitSet.valueOf(new byte[]{input[offset]});

        final int MV_BIT_INDEX = 7;
        final int AH_BIT_INDEX = 6;
        final int AM_BIT_INDEX = 5;

        //decode mv
        manageVerticalModeActive = firstOctetBits.get(MV_BIT_INDEX);
        appendItemDebugMsg("Managed Vertical Mode Active", manageVerticalModeActive);

        //decode ah
        altitudeHoldActive = firstOctetBits.get(AH_BIT_INDEX);
        appendItemDebugMsg("Altitude Hold Active", altitudeHoldActive);

        //decode am
        approachModeActive = firstOctetBits.get(AM_BIT_INDEX);
        appendItemDebugMsg("Approach Mode Active", approachModeActive);

        //decode altitude
        byte firstOctetValueWithoutModes = input[offset];
        if (firstOctetBits.get(MV_BIT_INDEX)) {
            firstOctetValueWithoutModes -= 128;
        }
        if (firstOctetBits.get(AH_BIT_INDEX)) {
            firstOctetValueWithoutModes -= 64;
        }
        if (firstOctetBits.get(AM_BIT_INDEX)) {
            firstOctetValueWithoutModes -= 32;
        }
        this.selectedAltitude
                = firstOctetValueWithoutModes * 256
                + Byte.toUnsignedInt(input[offset + 1]);
        appendItemDebugMsg("Selected Altitude (25 ft)", selectedAltitude);
    }

    @Override
    protected boolean validate() {
        return getSelectedAltitudeInFeet() >= -1300 && getSelectedAltitudeInFeet() <= 100000;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item148 - Final State Selected Altitude";
    }

    public boolean isManageVerticalModeActive() {
        return manageVerticalModeActive;
    }

    public boolean isApproachModeActive() {
        return approachModeActive;
    }

    public boolean isAltitudeHoldActive() {
        return altitudeHoldActive;
    }

    /**
     * @return The selected altitude in 25 feet values (Asterix unit of measure)
     */
    public int getSelectedAltitude() {
        return selectedAltitude;
    }

    /**
     * @return The selected altitude in feet
     */
    public int getSelectedAltitudeInFeet() {
        return selectedAltitude * 25;
    }
}
