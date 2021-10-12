package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.VariableLengthAsterixData;
import jlg.jade.common.UnsignedNumericDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item271 extends VariableLengthAsterixData {

    //primary octet variables
    private boolean POA;
    private boolean CDTIS;
    private boolean B2Low;
    private boolean RAS;
    private boolean IDENT;

    //first extent octet variables
    private int LW;

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        BitSet primaryBitSet = BitSet.valueOf(new byte[]{input[offset]});

        //decode primary octet values
        final int POA_BIT_INDEX = 5;
        final int CDTIS_BIT_INDEX = 4;
        final int B2Low_BIT_INDEX = 3;
        final int RAS_BIT_INDEX = 2;
        final int IDENT_BIT_INDEX = 1;

        this.POA = primaryBitSet.get(POA_BIT_INDEX);
        this.CDTIS = primaryBitSet.get(CDTIS_BIT_INDEX);
        this.B2Low = primaryBitSet.get(B2Low_BIT_INDEX);
        this.RAS = primaryBitSet.get(RAS_BIT_INDEX);
        this.IDENT = primaryBitSet.get(IDENT_BIT_INDEX);

        //decode secondary octet values
        if (this.getSizeInBytes() > 1) {

            LW = UnsignedNumericDecoder.decodeFromOneByte(input, offset + 1);

        }

    }

    public boolean isPOA() {
        return POA;
    }

    public boolean isB2Low() {
        return B2Low;
    }

    public boolean isRAS() {
        return RAS;
    }

    public boolean isIDENT() {
        return IDENT;
    }

    public int getLW() {
        return LW;
    }

    public boolean isCDTIS() {
        return CDTIS;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item271 - Surface Capabilities and Characteristics";
    }

}
