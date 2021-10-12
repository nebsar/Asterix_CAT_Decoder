package jlg.jade.asterix.cat021;

import java.nio.ByteBuffer;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.Constants;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item152 extends FixedLengthAsterixData {

    private int magneticHeading;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.magneticHeading
                = Byte.toUnsignedInt(input[offset]) * 256
                + Byte.toUnsignedInt(input[offset + 1]);

        appendItemDebugMsg("Magnetic heading", this.magneticHeading);
        appendItemDebugMsg("Magnetic heading (deg)", this.getMagneticHeadingDegrees());
    }

    @Override
    public byte[] encode() {
        byte[] itemAsByteArray = ByteBuffer.allocate(this.sizeInBytes)
                .putShort((short) this.magneticHeading)
                .array();

        return itemAsByteArray;
    }

    @Override
    protected boolean validate() {
        return true;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item152 - Magnetic Heading";
    }

    /**
     * Get magnetic heading in Asterix unit of measure
     */
    public int getMagneticHeading() {
        return magneticHeading;
    }

    /**
     * Set the magnetic heading. Unit of measure is 0.0055 degrees
     *
     * @param magneticHeading
     */
    public void setMagneticHeading(int magneticHeading) {
        this.magneticHeading = magneticHeading;
    }

    /**
     * Get the magnetic heading converted in integer degrees
     */
    public int getMagneticHeadingDegrees() {
        return (int) (this.magneticHeading * Constants.FROM_ASTERIX_MAGENTIC_HEADING_TO_DEGREES);
    }

}
