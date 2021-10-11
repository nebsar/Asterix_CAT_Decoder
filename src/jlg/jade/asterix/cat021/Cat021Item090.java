package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.VariableLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item090 extends VariableLengthAsterixData {

    //Fixed part variables
    private int NUCrNACvValue;
    private int NUCpNICValue;

    //First extent variables
    private int NICBaroValue;
    private int SILValue;
    private int NACpValue;

    //Second extent variables
    private int SILSValue;
    private int SDAValue;
    private int GVAValue;

    //Third extent variables
    private int PICValue;

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        // parse first octet
        BitSet octetBits = BitSet.valueOf(new byte[]{input[offset]});

        decodeNUCrNACvValue(octetBits);
        decodeNUCpNICValue(octetBits);

        // parse first extent if present
        if (this.getSizeInBytes() == 2) {

            BitSet firstExtentBits = BitSet.valueOf(new byte[]{input[offset + 1]});

            decodeNICBaroValue(firstExtentBits);
            decodeSILValue(firstExtentBits);
            decodeNACpValue(firstExtentBits);

        }

        // parse second extent if present
        if (this.getSizeInBytes() == 3) {

            BitSet secondExtentBits = BitSet.valueOf(new byte[]{input[offset + 2]});

            decodeSILSValue(secondExtentBits);
            decodeSDAValue(secondExtentBits);
            decodeGVAValue(secondExtentBits);

        }

        // parse third extent if present
        if (this.getSizeInBytes() == 4) {

            BitSet thirdExtentBits = BitSet.valueOf(new byte[]{input[offset + 3]});

            decodePICValue(thirdExtentBits);

        }

    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item090 - Quality Indicators";
    }

    public int getNUCrNACvValue() {
        return this.NUCrNACvValue;
    }

    public int getNUCpNICValue() {
        return this.NUCpNICValue;
    }

    public int getNICBaroValue() {
        return this.NICBaroValue;
    }

    public int getSILValue() {
        return this.SILValue;
    }

    public int getNACpValue() {
        return this.NACpValue;
    }

    public int getSILSValue() {
        return this.SILSValue;
    }

    public int getSDAValue() {
        return this.SDAValue;
    }

    public int getGVAValue() {
        return this.GVAValue;
    }

    public int getPICValue() {
        return this.PICValue;
    }

    private int decodeNUCrNACvValue(BitSet octetBits) {
        final int NUCrNACv_BIT0_INDEX = 5;
        final int NUCrNACv_BIT1_INDEX = 6;
        final int NUCrNACv_BIT2_INDEX = 7;
        int NUCrNACvBit0Value = 0;
        int NUCrNACvBit1Value = 0;
        int NUCrNACvBit2Value = 0;

        if (octetBits.get(NUCrNACv_BIT0_INDEX)) {
            NUCrNACvBit0Value = 1;
        } else {
            NUCrNACvBit0Value = 0;
        }
        if (octetBits.get(NUCrNACv_BIT1_INDEX)) {
            NUCrNACvBit1Value = 1;
        } else {
            NUCrNACvBit1Value = 0;
        }
        if (octetBits.get(NUCrNACv_BIT2_INDEX)) {
            NUCrNACvBit2Value = 1;
        } else {
            NUCrNACvBit2Value = 0;
        }

        this.NUCrNACvValue = NUCrNACvBit2Value * 4 + NUCrNACvBit1Value * 2 + NUCrNACvBit0Value;

        return this.NUCrNACvValue;

    }

    private int decodeNUCpNICValue(BitSet octetBits) {
        final int NUCrNACv_BIT0_INDEX = 1;
        final int NUCrNACv_BIT1_INDEX = 2;
        final int NUCrNACv_BIT2_INDEX = 3;
        final int NUCrNACv_BIT3_INDEX = 4;
        int NUCpNICBit0Value = 0;
        int NUCpNICBit1Value = 0;
        int NUCpNICBit2Value = 0;
        int NUCpNICBit3Value = 0;

        if (octetBits.get(NUCrNACv_BIT0_INDEX)) {
            NUCpNICBit0Value = 1;
        } else {
            NUCpNICBit0Value = 0;
        }

        if (octetBits.get(NUCrNACv_BIT1_INDEX)) {
            NUCpNICBit1Value = 1;
        } else {
            NUCpNICBit1Value = 0;
        }

        if (octetBits.get(NUCrNACv_BIT2_INDEX)) {
            NUCpNICBit2Value = 1;
        } else {
            NUCpNICBit2Value = 0;
        }

        if (octetBits.get(NUCrNACv_BIT3_INDEX)) {
            NUCpNICBit3Value = 1;
        } else {
            NUCpNICBit3Value = 0;
        }

        this.NUCrNACvValue = NUCpNICBit3Value * 8 + NUCpNICBit2Value * 4 + NUCpNICBit1Value * 2 + NUCpNICBit0Value;

        return this.NUCrNACvValue;
    }

    private int decodeNICBaroValue(BitSet firstExtentBits) {
        final int NICBaro_BIT_INDEX = 7;
        int NICBaroBitValue = 0;

        if (firstExtentBits.get(NICBaro_BIT_INDEX)) {
            NICBaroBitValue = 1;
        } else {
            NICBaroBitValue = 0;
        }

        this.NICBaroValue = NICBaroBitValue;

        return this.NICBaroValue;

    }

    private int decodeSILValue(BitSet firstExtentBits) {
        final int SIL_BIT0_INDEX = 5;
        final int SIL_BIT1_INDEX = 6;

        int SILBit0Value = 0;
        int SILBit1Value = 0;

        if (firstExtentBits.get(SIL_BIT0_INDEX)) {
            SILBit0Value = 1;
        } else {
            SILBit0Value = 0;
        }

        if (firstExtentBits.get(SIL_BIT1_INDEX)) {
            SILBit1Value = 1;
        } else {
            SILBit1Value = 0;
        }

        this.SILValue = SILBit1Value * 2 + SILBit0Value;

        return this.SILValue;

    }

    private int decodeNACpValue(BitSet firstExtentBits) {
        final int NACp_BIT0_INDEX = 1;
        final int NACp_BIT1_INDEX = 2;
        final int NACp_BIT2_INDEX = 3;
        final int NACp_BIT3_INDEX = 4;
        int NACpBit0Value = 0;
        int NACpBit1Value = 0;
        int NACpBit2Value = 0;
        int NACpBit3Value = 0;

        if (firstExtentBits.get(NACp_BIT0_INDEX)) {
            NACpBit0Value = 1;
        } else {
            NACpBit0Value = 0;
        }

        if (firstExtentBits.get(NACp_BIT1_INDEX)) {
            NACpBit1Value = 1;
        } else {
            NACpBit1Value = 0;
        }

        if (firstExtentBits.get(NACp_BIT2_INDEX)) {
            NACpBit2Value = 1;
        } else {
            NACpBit2Value = 0;
        }

        if (firstExtentBits.get(NACp_BIT3_INDEX)) {
            NACpBit3Value = 1;
        } else {
            NACpBit3Value = 0;
        }

        this.NACpValue = NACpBit3Value * 8 + NACpBit2Value * 4 + NACpBit1Value * 2 + NACpBit0Value;

        return this.NACpValue;
    }

    private int decodeSILSValue(BitSet secondExtentBits) {
        final int SILS_BIT_INDEX = 5;
        int SILSBitValue = 0;

        if (secondExtentBits.get(SILS_BIT_INDEX)) {
            SILSBitValue = 1;
        } else {
            SILSBitValue = 0;
        }

        this.SILSValue = SILSBitValue;

        return this.SILSValue;

    }

    private int decodeSDAValue(BitSet secondExtentBits) {
        final int SDA_BIT0_INDEX = 3;
        final int SDA_BIT1_INDEX = 4;

        int SDABit0Value = 0;
        int SDABit1Value = 0;

        if (secondExtentBits.get(SDA_BIT0_INDEX)) {
            SDABit0Value = 1;
        } else {
            SDABit0Value = 0;
        }

        if (secondExtentBits.get(SDA_BIT1_INDEX)) {
            SDABit1Value = 1;
        } else {
            SDABit1Value = 0;
        }

        this.SDAValue = SDABit1Value * 2 + SDABit0Value;

        return this.SDAValue;
    }

    private int decodeGVAValue(BitSet secondExtentBits) {
        final int GVA_BIT0_INDEX = 1;
        final int GVA_BIT1_INDEX = 2;

        int GVABit0Value = 0;
        int GVABit1Value = 0;

        if (secondExtentBits.get(GVA_BIT0_INDEX)) {
            GVABit0Value = 1;
        } else {
            GVABit0Value = 0;
        }

        if (secondExtentBits.get(GVA_BIT1_INDEX)) {
            GVABit1Value = 1;
        } else {
            GVABit1Value = 0;
        }

        this.SILValue = GVABit1Value * 2 + GVABit0Value;

        return this.SILValue;
    }

    private int decodePICValue(BitSet thirdExtentBits) {
        final int PIC_BIT0_INDEX = 4;
        final int PIC_BIT1_INDEX = 5;
        final int PIC_BIT2_INDEX = 6;
        final int PIC_BIT3_INDEX = 7;
        int PICBit0Value = 0;
        int PICBit1Value = 0;
        int PICBit2Value = 0;
        int PICBit3Value = 0;

        if (thirdExtentBits.get(PIC_BIT0_INDEX)) {
            PICBit0Value = 1;
        } else {
            PICBit0Value = 0;
        }

        if (thirdExtentBits.get(PIC_BIT1_INDEX)) {
            PICBit1Value = 1;
        } else {
            PICBit1Value = 0;
        }

        if (thirdExtentBits.get(PIC_BIT2_INDEX)) {
            PICBit2Value = 1;
        } else {
            PICBit2Value = 0;
        }

        if (thirdExtentBits.get(PIC_BIT3_INDEX)) {
            PICBit3Value = 1;
        } else {
            PICBit3Value = 0;
        }

        this.PICValue = PICBit3Value * 8 + PICBit2Value * 4 + PICBit1Value * 2 + PICBit0Value;

        return this.PICValue;
    }

}
