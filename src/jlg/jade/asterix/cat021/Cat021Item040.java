package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.VariableLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item040 extends VariableLengthAsterixData {

    //Fixed part variables
    private int ATPValue;
    private int ARCValue;
    private int RCValue;
    private int RABValue;

    //First extent variables
    private int DCRValue;
    private int GBSValue;
    private int SIMValue;
    private int TSTValue;
    private int SAAValue;
    private int CLValue;

    //Second extent variables
    private int EC7Value;
    private int EC6Value;
    private int IPCValue;
    private int NOGOValue;
    private int CPRValue;
    private int LDPJValue;
    private int RCFValue;

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        // parse first octet
        BitSet octetBits = BitSet.valueOf(new byte[]{input[offset]});

        decodeATPValue(octetBits);
        decodeARCValue(octetBits);
        decodeRCValue(octetBits);
        decodeRABValue(octetBits);

        // parse first extent if present
        if (this.getSizeInBytes() == 2) {

            BitSet firstExtentBits = BitSet.valueOf(new byte[]{input[offset + 1]});

            decodeDCRValue(firstExtentBits);
            decodeGBSValue(firstExtentBits);
            decodeSIMValue(firstExtentBits);
            decodeTSTValue(firstExtentBits);
            decodeSAAValue(firstExtentBits);
            decodeCLValue(firstExtentBits);
        }

        // parse second extent if present
        if (this.getSizeInBytes() == 3) {
            BitSet secondExtentBits = BitSet.valueOf(new byte[]{input[offset + 2]});

            decodeEC7Value(secondExtentBits);
            decodeEC6Value(secondExtentBits);
            decodeIPCValue(secondExtentBits);
            decodeNOGOValue(secondExtentBits);
            decodeCPRValue(secondExtentBits);
            decodeLDPJValue(secondExtentBits);
            decodeRCFValue(secondExtentBits);

        }
    }

    public int getATPValue() {
        return this.ATPValue;
    }

    public int getARCValue() {
        return this.ARCValue;
    }

    public int getRCValue() {
        return this.RCValue;
    }

    public int getRABValue() {
        return this.RABValue;
    }

    public int getTSTValue() {
        return this.TSTValue;
    }

    public int getDCRValue() {
        return this.DCRValue;
    }

    public int getGBSValue() {
        return this.GBSValue;
    }

    public int getSIMValue() {
        return this.SIMValue;
    }

    public int getSAAValue() {
        return this.SAAValue;
    }

    public int getCLValue() {
        return this.CLValue;
    }

    public int getEC7Value() {
        return this.EC7Value;
    }

    public int getEC6Value() {
        return this.EC6Value;
    }

    public int getIPCValue() {
        return this.IPCValue;
    }

    public int getNOGOValue() {
        return this.NOGOValue;
    }

    public int getCPRValue() {
        return this.CPRValue;
    }

    public int getLDPJValue() {
        return this.LDPJValue;
    }

    public int getRCFValue() {
        return this.RCFValue;
    }

    private int decodeATPValue(BitSet fixedPartBits) {
        final int ATP_BIT0_INDEX = 5;
        final int ATP_BIT1_INDEX = 6;
        final int ATP_BIT2_INDEX = 7;
        int atpBit0Value = 0;
        int atpBit1Value = 0;
        int atpBit2Value = 0;

        if (fixedPartBits.get(ATP_BIT0_INDEX)) {
            atpBit0Value = 1;
        } else {
            atpBit0Value = 0;
        }

        if (fixedPartBits.get(ATP_BIT1_INDEX)) {
            atpBit1Value = 1;
        } else {
            atpBit1Value = 0;
        }

        if (fixedPartBits.get(ATP_BIT2_INDEX)) {
            atpBit2Value = 1;
        } else {
            atpBit2Value = 0;
        }

        this.ATPValue = atpBit2Value * 4 + atpBit1Value * 2 + atpBit0Value;

        return this.ATPValue;
    }

    private int decodeARCValue(BitSet fixedPartBits) {
        final int ARC_BIT0_INDEX = 3;
        final int ARC_BIT1_INDEX = 4;
        int arcBit0Value = 0;
        int arcBit1Value = 0;

        if (fixedPartBits.get(ARC_BIT0_INDEX)) {
            arcBit0Value = 1;
        } else {
            arcBit0Value = 0;
        }

        if (fixedPartBits.get(ARC_BIT1_INDEX)) {
            arcBit1Value = 1;
        } else {
            arcBit1Value = 0;
        }

        this.ARCValue = arcBit1Value * 2 + arcBit0Value;

        return this.ARCValue;
    }

    private int decodeRCValue(BitSet fixedPartBits) {
        final int RC_BIT_INDEX = 2;
        if (fixedPartBits.get(RC_BIT_INDEX)) {
            this.RCValue = 1;
        } else {
            this.RCValue = 0;
        }

        return RCValue;
    }

    private int decodeRABValue(BitSet fixedPartBits) {
        final int RAB_BIT_INDEX = 1;
        if (fixedPartBits.get(RAB_BIT_INDEX)) {
            this.RABValue = 1;
        } else {
            this.RABValue = 0;
        }

        return RABValue;
    }

    private int decodeDCRValue(BitSet extentBits) {
        final int DCR_BIT_INDEX = 7;
        if (extentBits.get(DCR_BIT_INDEX)) {
            this.DCRValue = 1;
        } else {
            this.DCRValue = 0;
        }

        return DCRValue;
    }

    private int decodeGBSValue(BitSet extentBits) {
        final int GBS_BIT_INDEX = 6;
        if (extentBits.get(GBS_BIT_INDEX)) {
            this.GBSValue = 1;
        } else {
            this.GBSValue = 0;
        }

        return DCRValue;
    }

    private int decodeSIMValue(BitSet extentBits) {
        final int SIM_BIT_INDEX = 5;
        if (extentBits.get(SIM_BIT_INDEX)) {
            this.SIMValue = 1;
        } else {
            this.SIMValue = 0;
        }

        return this.SIMValue;
    }

    private int decodeTSTValue(BitSet extentBits) {
        final int TST_BIT_INDEX = 4;
        if (extentBits.get(TST_BIT_INDEX)) {
            this.TSTValue = 1;
        } else {
            this.TSTValue = 0;
        }

        return this.TSTValue;
    }

    private int decodeSAAValue(BitSet extentBits) {
        final int SAA_BIT_INDEX = 3;
        if (extentBits.get(SAA_BIT_INDEX)) {
            this.SAAValue = 1;
        } else {
            this.SAAValue = 0;
        }

        return this.SAAValue;
    }

    private int decodeCLValue(BitSet extentBits) {
        final int CL_BIT0_INDEX = 1;
        final int CL_BIT1_INDEX = 2;
        int clBit0Value = 0;
        int clBit1Value = 0;

        if (extentBits.get(CL_BIT0_INDEX)) {
            clBit0Value = 1;
        } else {
            clBit0Value = 0;
        }

        if (extentBits.get(CL_BIT1_INDEX)) {
            clBit1Value = 1;
        } else {
            clBit1Value = 0;
        }

        this.CLValue = clBit1Value * 2 + clBit0Value;

        return this.CLValue;
    }

    private int decodeEC7Value(BitSet secondExtentBits) {
        final int EC7_BIT_INDEX = 7;
        if (secondExtentBits.get(EC7_BIT_INDEX)) {
            this.EC7Value = 1;
        } else {
            this.EC7Value = 0;
        }

        return this.EC7Value;
    }

    private int decodeEC6Value(BitSet secondExtentBits) {
        final int EC6_BIT_INDEX = 6;
        if (secondExtentBits.get(EC6_BIT_INDEX)) {
            this.EC6Value = 1;
        } else {
            this.EC6Value = 0;
        }

        return this.EC6Value;
    }

    private int decodeIPCValue(BitSet secondExtentBits) {
        final int IPC_BIT_INDEX = 5;
        if (secondExtentBits.get(IPC_BIT_INDEX)) {
            this.IPCValue = 1;
        } else {
            this.IPCValue = 0;
        }

        return this.IPCValue;
    }

    private int decodeNOGOValue(BitSet secondExtentBits) {
        final int NOGO_BIT_INDEX = 4;
        if (secondExtentBits.get(NOGO_BIT_INDEX)) {
            this.NOGOValue = 1;
        } else {
            this.NOGOValue = 0;
        }

        return this.NOGOValue;
    }

    private int decodeCPRValue(BitSet secondExtentBits) {
        final int CPR_BIT_INDEX = 3;
        if (secondExtentBits.get(CPR_BIT_INDEX)) {
            this.CPRValue = 1;
        } else {
            this.CPRValue = 0;
        }

        return this.CPRValue;
    }

    private int decodeLDPJValue(BitSet secondExtentBits) {
        final int LDPJ_BIT_INDEX = 2;
        if (secondExtentBits.get(LDPJ_BIT_INDEX)) {
            this.LDPJValue = 1;
        } else {
            this.LDPJValue = 0;
        }

        return this.LDPJValue;
    }

    private int decodeRCFValue(BitSet secondExtentBits) {
        final int RCF_BIT_INDEX = 1;
        if (secondExtentBits.get(RCF_BIT_INDEX)) {
            this.RCFValue = 1;
        } else {
            this.RCFValue = 0;
        }

        return this.RCFValue;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item040 - Target Report Descriptor";
    }

}
