package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.Cat021_062AsterixAgingDataField;
import jlg.jade.asterix.FspecAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item295 extends FspecAsterixData {

    private Cat021_062AsterixAgingDataField subfield1;
    private Cat021_062AsterixAgingDataField subfield2;
    private Cat021_062AsterixAgingDataField subfield3;
    private Cat021_062AsterixAgingDataField subfield4;
    private Cat021_062AsterixAgingDataField subfield5;
    private Cat021_062AsterixAgingDataField subfield6;
    private Cat021_062AsterixAgingDataField subfield7;
    private Cat021_062AsterixAgingDataField subfield8;
    private Cat021_062AsterixAgingDataField subfield9;
    private Cat021_062AsterixAgingDataField subfield10;
    private Cat021_062AsterixAgingDataField subfield11;
    private Cat021_062AsterixAgingDataField subfield12;
    private Cat021_062AsterixAgingDataField subfield13;
    private Cat021_062AsterixAgingDataField subfield14;
    private Cat021_062AsterixAgingDataField subfield15;
    private Cat021_062AsterixAgingDataField subfield16;
    private Cat021_062AsterixAgingDataField subfield17;
    private Cat021_062AsterixAgingDataField subfield18;
    private Cat021_062AsterixAgingDataField subfield19;
    private Cat021_062AsterixAgingDataField subfield20;
    private Cat021_062AsterixAgingDataField subfield21;
    private Cat021_062AsterixAgingDataField subfield22;
    private Cat021_062AsterixAgingDataField subfield23;

    @Override
    protected int setMaxFspecSizeInBytes() {
        return AsterixItemLength.FOUR_BYTES.getValue();
    }

    @Override
    protected int decodeFromByteArray(byte[] input, int offset, int length) {
        if (fspecDataAtIndex(Fspec.SUBFIELD_1)) {
            subfield1 = new Cat021_062AsterixAgingDataField();
            offset = subfield1.decode(input, offset, length);
            appendDebugMsg("Item295Subfield1 - AOS age");
            appendNewLine();
            appendDebugMsg(subfield1.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_2)) {
            subfield2 = new Cat021_062AsterixAgingDataField();
            offset = subfield2.decode(input, offset, length);
            appendDebugMsg("Item295Subfield2 - TRD age");
            appendNewLine();
            appendDebugMsg(subfield2.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_3)) {
            subfield3 = new Cat021_062AsterixAgingDataField();
            offset = subfield3.decode(input, offset, length);
            appendDebugMsg("Item295Subfield3 - Mode3 age");
            appendNewLine();
            appendDebugMsg(subfield3.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_4)) {
            subfield4 = new Cat021_062AsterixAgingDataField();
            offset = subfield4.decode(input, offset, length);
            appendDebugMsg("Item295Subfield4 - Q/I age");
            appendNewLine();
            appendDebugMsg(subfield4.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_5)) {
            subfield5 = new Cat021_062AsterixAgingDataField();
            offset = subfield5.decode(input, offset, length);
            appendDebugMsg("Item295Subfield5 -TI age");
            appendNewLine();
            appendDebugMsg(subfield5.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_6)) {
            subfield6 = new Cat021_062AsterixAgingDataField();
            offset = subfield6.decode(input, offset, length);
            appendDebugMsg("Item295Subfield6 - MAM age");
            appendNewLine();
            appendDebugMsg(subfield6.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_7)) {
            subfield7 = new Cat021_062AsterixAgingDataField();
            offset = subfield7.decode(input, offset, length);
            appendDebugMsg("Item295Subfield7 - GH age");
            appendNewLine();
            appendDebugMsg(subfield7.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_8)) {
            subfield8 = new Cat021_062AsterixAgingDataField();
            offset = subfield8.decode(input, offset, length);
            appendDebugMsg("Item295Subfield8 - Flight Level age");
            appendNewLine();
            appendDebugMsg(subfield8.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_9)) {
            subfield9 = new Cat021_062AsterixAgingDataField();
            offset = subfield9.decode(input, offset, length);
            appendDebugMsg("Item295Subfield9 - Indicated Airspeed age");
            appendNewLine();
            appendDebugMsg(subfield9.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_10)) {
            subfield10 = new Cat021_062AsterixAgingDataField();
            offset = subfield10.decode(input, offset, length);
            appendDebugMsg("Item295Subfield10 - Final state selected altitude age");
            appendNewLine();
            appendDebugMsg(subfield10.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_11)) {
            subfield11 = new Cat021_062AsterixAgingDataField();
            offset = subfield11.decode(input, offset, length);
            appendDebugMsg("Item295Subfield11 - Airspeed age");
            appendNewLine();
            appendDebugMsg(subfield11.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_12)) {
            subfield12 = new Cat021_062AsterixAgingDataField();
            offset = subfield12.decode(input, offset, length);
            appendDebugMsg("Item295Subfield12 - True Speed age");
            appendNewLine();
            appendDebugMsg(subfield12.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_13)) {
            subfield13 = new Cat021_062AsterixAgingDataField();
            offset = subfield13.decode(input, offset, length);
            appendDebugMsg("Item295Subfield13 - Magnetic Heading age");
            appendNewLine();
            appendDebugMsg(subfield13.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_14)) {
            subfield14 = new Cat021_062AsterixAgingDataField();
            offset = subfield14.decode(input, offset, length);
            appendDebugMsg("Item295Subfield14 - Barometric Vertical Rate age");
            appendNewLine();
            appendDebugMsg(subfield14.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_15)) {
            subfield15 = new Cat021_062AsterixAgingDataField();
            offset = subfield15.decode(input, offset, length);
            appendDebugMsg("Item295Subfield15 - Geometric Vertical Rate age");
            appendNewLine();
            appendDebugMsg(subfield15.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_16)) {
            subfield16 = new Cat021_062AsterixAgingDataField();
            offset = subfield16.decode(input, offset, length);
            appendDebugMsg("Item295Subfield16 - Ground Vector age");
            appendNewLine();
            appendDebugMsg(subfield16.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_17)) {
            subfield17 = new Cat021_062AsterixAgingDataField();
            offset = subfield17.decode(input, offset, length);
            appendDebugMsg("Item295Subfield17 - Track angle rate age");
            appendNewLine();
            appendDebugMsg(subfield17.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_18)) {
            subfield18 = new Cat021_062AsterixAgingDataField();
            offset = subfield18.decode(input, offset, length);
            appendDebugMsg("Item295Subfield18 - Target Indentification age");
            appendNewLine();
            appendDebugMsg(subfield18.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_19)) {
            subfield19 = new Cat021_062AsterixAgingDataField();
            offset = subfield19.decode(input, offset, length);
            appendDebugMsg("Item295Subfield19 - Target Status age");
            appendNewLine();
            appendDebugMsg(subfield19.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_20)) {
            subfield20 = new Cat021_062AsterixAgingDataField();
            offset = subfield20.decode(input, offset, length);
            appendDebugMsg("Item295Subfield20 - Met Information age");
            appendNewLine();
            appendDebugMsg(subfield20.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_21)) {
            subfield21 = new Cat021_062AsterixAgingDataField();
            offset = subfield21.decode(input, offset, length);
            appendDebugMsg("Item295Subfield21 - Roll Angle age");
            appendNewLine();
            appendDebugMsg(subfield21.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_22)) {
            subfield22 = new Cat021_062AsterixAgingDataField();
            offset = subfield22.decode(input, offset, length);
            appendDebugMsg("Item295Subfield22 - ACAS Resolution age");
            appendNewLine();
            appendDebugMsg(subfield22.getDebugString());
        }

        if (fspecDataAtIndex(Fspec.SUBFIELD_23)) {
            subfield23 = new Cat021_062AsterixAgingDataField();
            offset = subfield23.decode(input, offset, length);
            appendDebugMsg("Item295Subfield23 - Surface Capabilities and Characteristics age");
            appendNewLine();
            appendDebugMsg(subfield23.getDebugString());
        }

        return offset;
    }

    public Cat021_062AsterixAgingDataField getSubfield1() {
        return subfield1;
    }

    public Cat021_062AsterixAgingDataField getSubfield2() {
        return subfield2;
    }

    public Cat021_062AsterixAgingDataField getSubfield3() {
        return subfield3;
    }

    public Cat021_062AsterixAgingDataField getSubfield4() {
        return subfield4;
    }

    public Cat021_062AsterixAgingDataField getSubfield5() {
        return subfield5;
    }

    public Cat021_062AsterixAgingDataField getSubfield6() {
        return subfield6;
    }

    public Cat021_062AsterixAgingDataField getSubfield7() {
        return subfield7;
    }

    public Cat021_062AsterixAgingDataField getSubfield8() {
        return subfield8;
    }

    public Cat021_062AsterixAgingDataField getSubfield9() {
        return subfield9;
    }

    public Cat021_062AsterixAgingDataField getSubfield10() {
        return subfield10;
    }

    public Cat021_062AsterixAgingDataField getSubfield11() {
        return subfield11;
    }

    public Cat021_062AsterixAgingDataField getSubfield12() {
        return subfield12;
    }

    public Cat021_062AsterixAgingDataField getSubfield13() {
        return subfield13;
    }

    public Cat021_062AsterixAgingDataField getSubfield14() {
        return subfield14;
    }

    public Cat021_062AsterixAgingDataField getSubfield15() {
        return subfield15;
    }

    public Cat021_062AsterixAgingDataField getSubfield16() {
        return subfield16;
    }

    public Cat021_062AsterixAgingDataField getSubfield17() {
        return subfield17;
    }

    public Cat021_062AsterixAgingDataField getSubfield18() {
        return subfield18;
    }

    public Cat021_062AsterixAgingDataField getSubfield19() {
        return subfield19;
    }

    public Cat021_062AsterixAgingDataField getSubfield20() {
        return subfield20;
    }

    public Cat021_062AsterixAgingDataField getSubfield21() {
        return subfield21;
    }

    public Cat021_062AsterixAgingDataField getSubfield22() {
        return subfield22;
    }

    public Cat021_062AsterixAgingDataField getSubfield23() {
        return subfield23;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item295 - Data Ages";
    }

    private static class Fspec {

        //first extent
        static final int SUBFIELD_7 = 1;
        static final int SUBFIELD_6 = 2;
        static final int SUBFIELD_5 = 3;
        static final int SUBFIELD_4 = 4;
        static final int SUBFIELD_3 = 5;
        static final int SUBFIELD_2 = 6;
        static final int SUBFIELD_1 = 7;

        //second extent
        static final int SUBFIELD_14 = 9;
        static final int SUBFIELD_13 = 10;
        static final int SUBFIELD_12 = 11;
        static final int SUBFIELD_11 = 12;
        static final int SUBFIELD_10 = 13;
        static final int SUBFIELD_9 = 14;
        static final int SUBFIELD_8 = 15;

        //third extent
        static final int SUBFIELD_21 = 17;
        static final int SUBFIELD_20 = 18;
        static final int SUBFIELD_19 = 19;
        static final int SUBFIELD_18 = 20;
        static final int SUBFIELD_17 = 21;
        static final int SUBFIELD_16 = 22;
        static final int SUBFIELD_15 = 23;

        //forth extent
        static final int SUBFIELD_23 = 30;
        static final int SUBFIELD_22 = 31;
    }

}
