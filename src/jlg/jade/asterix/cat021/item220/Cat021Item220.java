package jlg.jade.asterix.cat021.item220;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FspecAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item220 extends FspecAsterixData {

    private Cat021Item220Subfield1 subfield1;
    private Cat021Item220Subfield2 subfield2;
    private Cat021Item220Subfield3 subfield3;
    private Cat021Item220Subfield4 subfield4;

    @Override
    protected int setMaxFspecSizeInBytes() {
        return AsterixItemLength.ONE_BYTE.getValue();
    }

    @Override
    protected int decodeFromByteArray(byte[] input, int offset, int length) {
        // subfield 1
        if (fspecDataAtIndex(Fspec.SUBFIELD_1)) {
            subfield1 = new Cat021Item220Subfield1();
            offset = subfield1.decode(input, offset, length);
            appendDebugMsg(subfield1.getDebugString());
        }

        // subfield 2
        if (fspecDataAtIndex(Fspec.SUBFIELD_2)) {
            subfield2 = new Cat021Item220Subfield2();
            offset = subfield2.decode(input, offset, length);
            appendDebugMsg(subfield2.getDebugString());
        }

        // subfield 3
        if (fspecDataAtIndex(Fspec.SUBFIELD_3)) {
            subfield3 = new Cat021Item220Subfield3();
            offset = subfield3.decode(input, offset, length);
            appendDebugMsg(subfield4.getDebugString());
        }

        // subfield 4
        if (fspecDataAtIndex(Fspec.SUBFIELD_4)) {
            subfield4 = new Cat021Item220Subfield4();
            offset = subfield4.decode(input, offset, length);
            appendDebugMsg(subfield4.getDebugString());
        }

        return offset;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item220 - Meteorological Information";
    }

    private static class Fspec {

        // first extent
        public static final int SUBFIELD_1 = 7;
        public static final int SUBFIELD_2 = 6;
        public static final int SUBFIELD_3 = 5;
        public static final int SUBFIELD_4 = 4;

    }

}
