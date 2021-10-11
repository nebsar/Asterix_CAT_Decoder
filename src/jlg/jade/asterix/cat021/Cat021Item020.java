package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item020 extends FixedLengthAsterixData {

    private int ECATValue;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.ONE_BYTE.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {
        this.ECATValue = input[offset];

        appendItemDebugMsg("ECAT:", this.ECATValue);
    }

//    private int decodeEmitterCategory(BitSet fixedPartBits) {
//        final int ECAT_BIT0_INDEX = 0;
//        final int ECAT_BIT1_INDEX = 1;
//        final int ECAT_BIT2_INDEX = 2;
//        final int ECAT_BIT3_INDEX = 3;
//        final int ECAT_BIT4_INDEX = 4;
//        final int ECAT_BIT5_INDEX = 5;
//        final int ECAT_BIT6_INDEX = 6;
//        final int ECAT_BIT7_INDEX = 7;
//
//        int ecatBit0Value = 0;
//        int ecatBit1Value = 0;
//        int ecatBit2Value = 0;
//        int ecatBit3Value = 0;
//        int ecatBit4Value = 0;
//        int ecatBit5Value = 0;
//        int ecatBit6Value = 0;
//        int ecatBit7Value = 0;
//
//        if (fixedPartBits.get(ECAT_BIT0_INDEX)) {
//            ecatBit0Value = 1;
//        }
//        if (fixedPartBits.get(ECAT_BIT1_INDEX)) {
//            ecatBit1Value = 1;
//        }
//        if (fixedPartBits.get(ECAT_BIT2_INDEX)) {
//            ecatBit2Value = 1;
//        }
//        if (fixedPartBits.get(ECAT_BIT3_INDEX)) {
//            ecatBit3Value = 1;
//        }
//        if (fixedPartBits.get(ECAT_BIT4_INDEX)) {
//            ecatBit4Value = 1;
//        }
//        if (fixedPartBits.get(ECAT_BIT5_INDEX)) {
//            ecatBit5Value = 1;
//        }
//        if (fixedPartBits.get(ECAT_BIT6_INDEX)) {
//            ecatBit6Value = 1;
//        }
//        if (fixedPartBits.get(ECAT_BIT7_INDEX)) {
//            ecatBit7Value = 1;
//        }
//
//        this.ECATValue = ecatBit7Value * 128 + ecatBit6Value * 64
//                + ecatBit5Value * 32 + ecatBit4Value * 16
//                + ecatBit3Value * 8 + ecatBit2Value * 4 + ecatBit1Value * 2 + ecatBit0Value;
//
//        appendItemDebugMsg(
//                "Emitter Category",
//                this.ECATValue);
//
//        return this.ECATValue;
//    }
    @Override
    protected String setDisplayName() {
        return "Cat021Item020 - Emitter Category";
    }

}
