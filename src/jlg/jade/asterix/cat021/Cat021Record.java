package jlg.jade.asterix.cat021;

import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.DefaultReservedFieldFactory;
import jlg.jade.asterix.FspecAsterixData;
import jlg.jade.asterix.ReservedAsterixField;
import jlg.jade.asterix.ReservedFieldFactory;
import jlg.jade.asterix.cat021.item110.Cat021Item110;
import jlg.jade.asterix.cat021.item220.Cat021Item220;

/**
 *
 * @author beni.morgan
 */
public class Cat021Record extends FspecAsterixData {

    private final ReservedFieldFactory reservedFieldFactory;
    private Cat021Item008 cat21Item008;
    private Cat021Item010 cat21Item010;
    private Cat021Item015 cat21Item015;
    private Cat021Item016 cat21Item016;
    private Cat021Item020 cat21Item020;
    private Cat021Item040 cat21Item040;
    private Cat021Item070 cat21Item070;
    private Cat021Item071 cat21Item071;
    private Cat021Item072 cat21Item072;
    private Cat021Item073 cat21Item073;
    private Cat021Item074 cat21Item074;
    private Cat021Item075 cat21Item075;
    private Cat021Item076 cat21Item076;
    private Cat021Item077 cat21Item077;
    private Cat021Item080 cat21Item080;
    private Cat021Item090 cat21Item090;
    private Cat021Item110 cat21Item110;
    private Cat021Item130 cat21Item130;
    private Cat021Item131 cat21Item131;
    private Cat021Item132 cat21Item132;
    private Cat021Item140 cat21Item140;
    private Cat021Item145 cat21Item145;
    private Cat021Item146 cat21Item146;
    private Cat021Item148 cat21Item148;
    private Cat021Item150 cat21Item150;
    private Cat021Item151 cat21Item151;
    private Cat021Item152 cat21Item152;
    private Cat021Item155 cat21Item155;
    private Cat021Item157 cat21Item157;
    private Cat021Item160 cat21Item160;
    private Cat021Item161 cat21Item161;
    private Cat021Item165 cat21Item165;
    private Cat021Item170 cat21Item170;
    private Cat021Item200 cat21Item200;
    private Cat021Item210 cat21Item210;
    private Cat021Item220 cat21Item220;
    private Cat021Item230 cat21Item230;
    private Cat021Item250 cat21Item250;
    private Cat021Item260 cat21Item260;
    private Cat021Item271 cat21Item271;
    private Cat021Item295 cat21Item295;
    private Cat021Item400 cat21Item400;
    private ReservedAsterixField reservedExpansionField;
    private ReservedAsterixField reservedSpecialPurposeField;

    public Cat021Record() {
        this.reservedFieldFactory = new DefaultReservedFieldFactory();
    }

    public Cat021Record(ReservedFieldFactory customReservedFieldFactory) {
        this.reservedFieldFactory = customReservedFieldFactory;
    }

    @Override

    protected int setMaxFspecSizeInBytes() {
        return AsterixItemLength.SEVEN_BYTES.getValue();
    }

    @Override
    protected int decodeFromByteArray(byte[] input, int offset, int length) {
         
        if (fspecDataAtIndex(FSPEC.I021_010)) {
            this.cat21Item010 = new Cat021Item010();
            offset = cat21Item010.decode(input, offset, length);
            appendDebugMsg(cat21Item010.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_040)) {
            this.cat21Item040 = new Cat021Item040();
            offset = cat21Item040.decode(input, offset, length);
            appendDebugMsg(cat21Item040.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_161)) {
            this.cat21Item161 = new Cat021Item161();
            offset = cat21Item161.decode(input, offset, length);
            appendDebugMsg(cat21Item161.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_015)) {
            this.cat21Item015 = new Cat021Item015();
            offset = cat21Item015.decode(input, offset, length);
            appendDebugMsg(cat21Item015.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_071)) {
            this.cat21Item071 = new Cat021Item071();
            offset = cat21Item071.decode(input, offset, length);
            appendDebugMsg(cat21Item071.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_130)) {
            this.cat21Item130 = new Cat021Item130();
            offset = cat21Item161.decode(input, offset, length);
            appendDebugMsg(cat21Item130.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_131)) {
            this.cat21Item131 = new Cat021Item131();
            offset = cat21Item131.decode(input, offset, length);
            appendDebugMsg(cat21Item131.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_072)) {
            this.cat21Item072 = new Cat021Item072();
            offset = cat21Item072.decode(input, offset, length);
            appendDebugMsg(cat21Item072.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_150)) {
            this.cat21Item150 = new Cat021Item150();
            offset = cat21Item150.decode(input, offset, length);
            appendDebugMsg(cat21Item150.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_151)) {
            this.cat21Item151 = new Cat021Item151();
            offset = cat21Item151.decode(input, offset, length);
            appendDebugMsg(cat21Item151.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_080)) {
            this.cat21Item080 = new Cat021Item080();
            offset = cat21Item080.decode(input, offset, length);
            appendDebugMsg(cat21Item080.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_073)) {
            this.cat21Item073 = new Cat021Item073();
            offset = cat21Item073.decode(input, offset, length);
            appendDebugMsg(cat21Item073.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_074)) {
            this.cat21Item074 = new Cat021Item074();
            offset = cat21Item074.decode(input, offset, length);
            appendDebugMsg(cat21Item074.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_075)) {
            this.cat21Item075 = new Cat021Item075();
            offset = cat21Item075.decode(input, offset, length);
            appendDebugMsg(cat21Item075.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_076)) {
            this.cat21Item076 = new Cat021Item076();
            offset = cat21Item076.decode(input, offset, length);
            appendDebugMsg(cat21Item076.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_140)) {
            this.cat21Item140 = new Cat021Item140();
            offset = cat21Item140.decode(input, offset, length);
            appendDebugMsg(cat21Item140.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_090)) {
            this.cat21Item090 = new Cat021Item090();
            offset = cat21Item090.decode(input, offset, length);
            appendDebugMsg(cat21Item090.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_210)) {
            this.cat21Item210 = new Cat021Item210();
            offset = cat21Item210.decode(input, offset, length);
            appendDebugMsg(cat21Item210.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_070)) {
            this.cat21Item070 = new Cat021Item070();
            offset = cat21Item070.decode(input, offset, length);
            appendDebugMsg(cat21Item070.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_230)) {
            this.cat21Item230 = new Cat021Item230();
            offset = cat21Item230.decode(input, offset, length);
            appendDebugMsg(cat21Item230.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_145)) {
            this.cat21Item145 = new Cat021Item145();
            offset = cat21Item210.decode(input, offset, length);
            appendDebugMsg(cat21Item145.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_152)) {
            this.cat21Item152 = new Cat021Item152();
            offset = cat21Item152.decode(input, offset, length);
            appendDebugMsg(cat21Item152.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_200)) {
            this.cat21Item200 = new Cat021Item200();
            offset = cat21Item200.decode(input, offset, length);
            appendDebugMsg(cat21Item200.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_155)) {
            this.cat21Item155 = new Cat021Item155();
            offset = cat21Item155.decode(input, offset, length);
            appendDebugMsg(cat21Item155.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_157)) {
            this.cat21Item157 = new Cat021Item157();
            offset = cat21Item157.decode(input, offset, length);
            appendDebugMsg(cat21Item157.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_160)) {
            this.cat21Item160 = new Cat021Item160();
            offset = cat21Item160.decode(input, offset, length);
            appendDebugMsg(cat21Item160.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_165)) {
            this.cat21Item165 = new Cat021Item165();
            offset = cat21Item165.decode(input, offset, length);
            appendDebugMsg(cat21Item165.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_077)) {
            this.cat21Item077 = new Cat021Item077();
            offset = cat21Item077.decode(input, offset, length);
            appendDebugMsg(cat21Item077.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_170)) {
            this.cat21Item170 = new Cat021Item170();
            offset = cat21Item170.decode(input, offset, length);
            appendDebugMsg(cat21Item170.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_020)) {
            this.cat21Item020 = new Cat021Item020();
            offset = cat21Item020.decode(input, offset, length);
            appendDebugMsg(cat21Item020.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_220)) {
            this.cat21Item220 = new Cat021Item220();
            offset = cat21Item220.decode(input, offset, length);
            appendDebugMsg(cat21Item220.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_146)) {
            this.cat21Item146 = new Cat021Item146();
            offset = cat21Item146.decode(input, offset, length);
            appendDebugMsg(cat21Item146.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_148)) {
            this.cat21Item148 = new Cat021Item148();
            offset = cat21Item148.decode(input, offset, length);
            appendDebugMsg(cat21Item148.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_110)) {
            this.cat21Item110 = new Cat021Item110();
            offset = cat21Item110.decode(input, offset, length);
            appendDebugMsg(cat21Item110.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_016)) {
            this.cat21Item016 = new Cat021Item016();
            offset = cat21Item016.decode(input, offset, length);
            appendDebugMsg(cat21Item016.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_008)) {
            this.cat21Item008 = new Cat021Item008();
            offset = cat21Item008.decode(input, offset, length);
            appendDebugMsg(cat21Item008.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_271)) {
            this.cat21Item271 = new Cat021Item271();
            offset = cat21Item271.decode(input, offset, length);
            appendDebugMsg(cat21Item271.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_132)) {
            this.cat21Item132 = new Cat021Item132();
            offset = cat21Item132.decode(input, offset, length);
            appendDebugMsg(cat21Item132.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_250)) {
            this.cat21Item250 = new Cat021Item250();
            offset = cat21Item250.decode(input, offset, length);
            appendDebugMsg(cat21Item250.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_260)) {
            this.cat21Item260 = new Cat021Item260();
            offset = cat21Item260.decode(input, offset, length);
            appendDebugMsg(cat21Item260.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_400)) {
            this.cat21Item400 = new Cat021Item400();
            offset = cat21Item400.decode(input, offset, length);
            appendDebugMsg(cat21Item400.getDebugString());
        }

        if (fspecDataAtIndex(FSPEC.I021_295)) {
            this.cat21Item295 = new Cat021Item295();
            offset = cat21Item295.decode(input, offset, length);
            appendDebugMsg(cat21Item295.getDebugString());
        }

        // SP
        if (fspecDataAtIndex(FSPEC.I021_SP)) {
            this.reservedSpecialPurposeField = this.reservedFieldFactory.createSpField();
            offset = reservedSpecialPurposeField.decode(input, offset, length);
            appendDebugMsg(this.reservedSpecialPurposeField.getDebugString());
        }

        // RE
        if (fspecDataAtIndex(FSPEC.I021_RE)) {
            this.reservedExpansionField = this.reservedFieldFactory.createReField();
            offset = reservedExpansionField.decode(input, offset, length);
            appendDebugMsg(this.reservedExpansionField.getDebugString());
        }

        appendDebugMsg("*** End of Category 048 Record ***");
        appendNewLine();

        return offset;

    }

    @Override
    protected String setDisplayName() {
        return "*** Category 021 Record ***";
    }

    public Cat021Item008 getItem008() {
        return cat21Item008;
    }

    public Cat021Item010 getItem010() {
        return cat21Item010;
    }

    public Cat021Item015 getItem015() {
        return cat21Item015;
    }

    public Cat021Item016 getItem016() {
        return cat21Item016;
    }

    public Cat021Item020 getItem020() {
        return cat21Item020;
    }

    public Cat021Item040 getItem040() {
        return cat21Item040;
    }

    public Cat021Item070 getItem070() {
        return cat21Item070;
    }

    public Cat021Item071 getItem071() {
        return cat21Item071;
    }

    public Cat021Item072 getItem072() {
        return cat21Item072;
    }

    public Cat021Item073 getItem073() {
        return cat21Item073;
    }

    public Cat021Item074 getItem074() {
        return cat21Item074;
    }

    public Cat021Item075 getItem075() {
        return cat21Item075;
    }

    public Cat021Item076 getItem076() {
        return cat21Item076;
    }

    public Cat021Item077 getItem077() {
        return cat21Item077;
    }

    public Cat021Item080 getItem080() {
        return cat21Item080;
    }

    public Cat021Item090 getItem090() {
        return cat21Item090;
    }

    public Cat021Item110 getItem110() {
        return cat21Item110;
    }

    public Cat021Item130 getItem130() {
        return cat21Item130;
    }

    public Cat021Item131 getItem131() {
        return cat21Item131;
    }

    public Cat021Item132 getItem132() {
        return cat21Item132;
    }

    public Cat021Item140 getItem140() {
        return cat21Item140;
    }

    public Cat021Item145 getItem145() {
        return cat21Item145;
    }

    public Cat021Item146 getItem146() {
        return cat21Item146;
    }

    public Cat021Item148 getItem148() {
        return cat21Item148;
    }

    public Cat021Item150 getItem150() {
        return cat21Item150;
    }

    public Cat021Item151 getItem151() {
        return cat21Item151;
    }

    public Cat021Item152 getItem152() {
        return cat21Item152;
    }

    public Cat021Item155 getItem155() {
        return cat21Item155;
    }

    public Cat021Item157 getItem157() {
        return cat21Item157;
    }

    public Cat021Item160 getItem160() {
        return cat21Item160;
    }

    public Cat021Item161 getItem161() {
        return cat21Item161;
    }

    public Cat021Item165 getItem165() {
        return cat21Item165;
    }

    public Cat021Item170 getItem170() {
        return cat21Item170;
    }

    public Cat021Item200 getItem200() {
        return cat21Item200;
    }

    public Cat021Item210 getItem210() {
        return cat21Item210;
    }

    public Cat021Item220 getItem220() {
        return cat21Item220;
    }

    public Cat021Item230 getItem230() {
        return cat21Item230;
    }

    public Cat021Item250 getItem250() {
        return cat21Item250;
    }

    public Cat021Item260 getItem260() {
        return cat21Item260;
    }

    public Cat021Item271 getItem271() {
        return cat21Item271;
    }

    public Cat021Item295 getItem295() {
        return cat21Item295;
    }

    public Cat021Item400 getItem400() {
        return cat21Item400;
    }

    private static class FSPEC {

        //first octet
        public final static int I021_010 = 7;
        public final static int I021_040 = 6;
        public final static int I021_161 = 5;
        public final static int I021_015 = 4;
        public final static int I021_071 = 3;
        public final static int I021_130 = 2;
        public final static int I021_131 = 1;
        //second octet
        public final static int I021_072 = 15;
        public final static int I021_150 = 14;
        public final static int I021_151 = 13;
        public final static int I021_080 = 12;
        public final static int I021_073 = 11;
        public final static int I021_074 = 10;
        public final static int I021_075 = 9;
        //third octet
        public final static int I021_076 = 23;
        public final static int I021_140 = 22;
        public final static int I021_090 = 21;
        public final static int I021_210 = 20;
        public final static int I021_070 = 19;
        public final static int I021_230 = 18;
        public final static int I021_145 = 17;
        //fourth octet
        public final static int I021_152 = 31;
        public final static int I021_200 = 30;
        public final static int I021_155 = 29;
        public final static int I021_157 = 28;
        public final static int I021_160 = 27;
        public final static int I021_165 = 26;
        public final static int I021_077 = 25;
        //fifth octet
        public final static int I021_170 = 39;
        public final static int I021_020 = 38;
        public final static int I021_220 = 37;
        public final static int I021_146 = 36;
        public final static int I021_148 = 35;
        public final static int I021_110 = 34;
        public final static int I021_016 = 33;
        //sixth octet
        public final static int I021_008 = 47;
        public final static int I021_271 = 46;
        public final static int I021_132 = 45;
        public final static int I021_250 = 44;
        public final static int I021_260 = 43;
        public final static int I021_400 = 42;
        public final static int I021_295 = 41;
        //seventh octet
        public final static int I021_RE = 50;
        public final static int I021_SP = 49;
    }

}
