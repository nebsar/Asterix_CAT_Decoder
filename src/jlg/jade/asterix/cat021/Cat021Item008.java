/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item008 extends FixedLengthAsterixData {

    private int RAValue;
    private int TCValue;
    private int TSValue;
    private int ARVValue;
    private int CDTIAValue;
    private int TCASValue;
    private int SAValue;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.ONE_BYTE.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        BitSet octetBits = BitSet.valueOf(new byte[]{input[offset]});

        decodeSAValue(octetBits);
        decodeTCASValue(octetBits);
        decodeCDTIAValue(octetBits);
        decodeARVValue(octetBits);
        decodeTSValue(octetBits);
        decodeTCValue(octetBits);
        decodeRAValue(octetBits);
    }

    @Override
    protected String setDisplayName() {
        return "Aircraft Operational Status";
    }

    private int decodeRAValue(BitSet fixedPartBits) {
        final int RA_BIT_VALUE = 7;
        if (fixedPartBits.get(RA_BIT_VALUE)) {
            this.RAValue = 1;
        } else {
            this.RAValue = 0;
        }
        appendItemDebugMsg(
                "RA (0=TCAS II or ACAS RA not active, 1=TCAS RA active)",
                this.RAValue);
        return this.RAValue;
    }

    private int decodeTCValue(BitSet fixedPartBits) {
        final int TC_BIT0_INDEX = 5;
        final int TC_BIT1_INDEX = 6;
        int tcBit0Value = 0;
        int tcBit1Value = 0;
        if (fixedPartBits.get(TC_BIT0_INDEX)) {
            tcBit0Value = 1;
        }
        if (fixedPartBits.get(TC_BIT1_INDEX)) {
            tcBit1Value = 1;
        }

        this.TCValue = tcBit1Value * 2 + tcBit0Value;

        appendItemDebugMsg("Target Change Report Capability (bits)", tcBit1Value + "" + tcBit0Value);
        appendItemDebugMsg(
                "Target Change Report Capability (decimal) (0=no capability for Trajectory Change Reports,1=support for TC+0 reports only,"
                + "2=support for multiple TC reports, 3=reserved)",
                this.TCValue);
        return this.TCValue;
    }

    private int decodeTSValue(BitSet fixedPartBits) {
        final int TS_BIT_VALUE = 4;
        if (fixedPartBits.get(TS_BIT_VALUE)) {
            this.TSValue = 1;
        } else {
            this.TSValue = 0;
        }
        appendItemDebugMsg(
                "TS (0=no capability to support Target State Reports, 1=capable of supporting target State Reports)",
                this.TSValue);
        return this.TSValue;

    }

    private int decodeARVValue(BitSet fixedPartBits) {
        final int ARV_BIT_VALUE = 3;
        if (fixedPartBits.get(ARV_BIT_VALUE)) {
            this.ARVValue = 1;
        } else {
            this.ARVValue = 0;
        }
        appendItemDebugMsg(
                "ARV (0=no capability to generate ARV-reports, 1=capable of generate ARV-reports)",
                this.ARVValue);
        return this.ARVValue;

    }

    private int decodeCDTIAValue(BitSet fixedPartBits) {
        final int CDTIA_BIT_VALUE = 2;
        if (fixedPartBits.get(CDTIA_BIT_VALUE)) {
            this.CDTIAValue = 1;
        } else {
            this.CDTIAValue = 0;
        }
        appendItemDebugMsg(
                "CDTIA (0=CDTI not operational, 1=CDTI operational)",
                this.CDTIAValue);
        return this.CDTIAValue;

    }

    private int decodeTCASValue(BitSet fixedPartBits) {
        final int TCAS_BIT_VALUE = 1;
        if (fixedPartBits.get(TCAS_BIT_VALUE)) {
            this.TCASValue = 1;
        } else {
            this.TCASValue = 0;
        }
        appendItemDebugMsg(
                "TCAS (0=TCAS operational or unknown, 1=TCAS operational or unknown)",
                this.TCASValue);
        return this.TCASValue;
    }

    private int decodeSAValue(BitSet fixedPartBits) {
        final int SA_BIT_VALUE = 1;
        if (fixedPartBits.get(SA_BIT_VALUE)) {
            this.SAValue = 1;
        } else {
            this.SAValue = 0;
        }
        appendItemDebugMsg(
                "SA (0=Antenna Diversity, 1=Single Antenna only)",
                this.TCASValue);
        return this.TCASValue;
    }

}
