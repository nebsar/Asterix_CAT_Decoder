package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.BitValueDecoder;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item200 extends FixedLengthAsterixData {

    private int priorty;
    private String priorityStatus;
    private int SS;
    private String surveillanceStatus;
    private int ICFValue;
    private int LNAVValue;
    private int MEValue;

    @Override
    protected int setSizeInBytes() {
        return 1;
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        BitSet octetBits = BitSet.valueOf(new byte[]{input[offset]});

        final int ICF_BIT_INDEX = 7;
        final int LNAV_BIT_INDEX = 6;
        final int ME_BIT_INDEX = 5;
        final int PS_START_BIT_INDEX = 2;
        final int PS_END_BIT_INDEX = 4;
        final int SS_START_BIT_INDEX = 0;
        final int SS_END_BIT_INDEX = 1;

        this.ICFValue = octetBits.get(ICF_BIT_INDEX) ? 1 : 0;
        this.LNAVValue = octetBits.get(LNAV_BIT_INDEX) ? 1 : 0;
        this.MEValue = octetBits.get(ME_BIT_INDEX) ? 1 : 0;

        priorty = BitValueDecoder.decodeFromThreeBits(octetBits, PS_START_BIT_INDEX, PS_END_BIT_INDEX);

        switch (priorty) {
            case 0:
                priorityStatus = "No emergency / not reported";

            case 1:
                priorityStatus = "General emergency";
                break;
            case 2:
                priorityStatus = "Lifeguard / medical emergency";
                break;
            case 3:
                priorityStatus = "Minimum fuel";
                break;
            case 4:
                priorityStatus = "No communications";
                break;
            case 5:
                priorityStatus = "Unlawful interference";
                break;
            case 6:
                priorityStatus = "Downed Aircraft";
                break;
        }

        this.SS = BitValueDecoder.decodeFromTwoBits(octetBits, SS_START_BIT_INDEX, SS_END_BIT_INDEX);

        switch (SS) {
            case 0:
                surveillanceStatus = "No condition reported";

            case 1:
                surveillanceStatus = "Permanent Alert (Emergency condition)";
                break;
            case 2:
                surveillanceStatus = "Temporary Alert (change in Mode 3/A Code other than emergency)";
                break;
            case 3:
                surveillanceStatus = "SPI set";
        }
    }

    public int getICFValue() {
        return this.ICFValue;
    }

    public int getLNAVValue() {
        return this.LNAVValue;
    }

    public int getMEValue() {
        return this.MEValue;
    }

    public String getPriorityStatus() {
        return this.priorityStatus;
    }

    public String getSurveillanceStatus() {
        return this.surveillanceStatus;
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item200 - Target Status";
    }

}
