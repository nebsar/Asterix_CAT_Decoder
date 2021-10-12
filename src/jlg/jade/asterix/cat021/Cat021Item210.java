/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.BitValueDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item210 extends FixedLengthAsterixData {

    int VNSValue;
    int VNValue;
    int LTTValue;

    @Override
    protected int setSizeInBytes() {
        return 1;
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        BitSet octetBits = BitSet.valueOf(new byte[]{input[offset]});

        final int VNS_BIT_INDEX = 6;
        final int VN_START_BIT_INDEX = 3;
        final int VN_END_BIT_INDEX = 5;
        final int LTT_START_BIT_INDEX = 0;
        final int LTT_END_BIT_INDEX = 2;

        this.VNSValue = octetBits.get(VNS_BIT_INDEX) ? 1 : 0;

        this.VNValue = BitValueDecoder.decodeFromThreeBits(octetBits, VN_START_BIT_INDEX, VN_END_BIT_INDEX);

        this.LTTValue = BitValueDecoder.decodeFromThreeBits(octetBits, LTT_START_BIT_INDEX, LTT_END_BIT_INDEX);

    }

    public int getVNSValue() {
        return this.VNSValue;
    }

    public int getVNValue() {
        return this.VNValue;
    }

    public int getLTTValue() {
        return this.LTTValue;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item210 - MOPS Version";
    }

}
