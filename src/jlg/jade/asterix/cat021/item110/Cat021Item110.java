package jlg.jade.asterix.cat021.item110;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FspecAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item110 extends FspecAsterixData {

    private Cat021Item110Subfield1 subfield1;
    private Cat021Item110Subfield2 subfield2;

    @Override
    protected int setMaxFspecSizeInBytes() {
        return AsterixItemLength.ONE_BYTE.getValue();
    }

    @Override
    protected int decodeFromByteArray(byte[] input, int offset, int length) {
        // subfield 1
        if (fspecDataAtIndex(Fspec.SUBFIELD_1)) {
            subfield1 = new Cat021Item110Subfield1();
            offset = subfield1.decode(input, offset, length);
            appendDebugMsg(subfield1.getDebugString());
        }

        // subfield 2
        if (fspecDataAtIndex(Fspec.SUBFIELD_2)) {
            subfield2 = new Cat021Item110Subfield2();
            offset = subfield2.decode(input, offset, length);
            appendDebugMsg(subfield2.getDebugString());
        }

        return offset;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item110 - Trajectory Intent";
    }

    private static class Fspec {

        // first extent
        public static final int SUBFIELD_1 = 7;
        public static final int SUBFIELD_2 = 6;

    }

}
