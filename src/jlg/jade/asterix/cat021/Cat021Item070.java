/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlg.jade.asterix.cat021;

import java.util.BitSet;
import jlg.jade.asterix.AsterixItemLength;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.common.ModeACode;

/**
 *
 * @author beni.morgan
 */
public class Cat021Item070 extends FixedLengthAsterixData {

    private int mode3AReply;

    @Override
    protected int setSizeInBytes() {
        return AsterixItemLength.TWO_BYTES.getValue();
    }

    @Override
    protected void decodeFromByteArray(byte[] input, int offset) {

        decodeMode3ARepresentation(input, offset);

    }

    private void decodeMode3ARepresentation(byte[] input, int offset) {

        int firstByteValue = Byte.toUnsignedInt(input[offset]);
        BitSet firstByteBits = BitSet.valueOf(new byte[]{input[offset]});

        // for each present bit with pos = 7-4 substract 2^pos from integer value
        if (firstByteBits.get(7)) {
            firstByteValue = firstByteValue - 128;
        }
        if (firstByteBits.get(6)) {
            firstByteValue = firstByteValue - 64;
        }
        if (firstByteBits.get(5)) {
            firstByteValue = firstByteValue - 32;
        }
        if (firstByteBits.get(4)) {
            firstByteValue = firstByteValue - 16;
        }

        this.mode3AReply = firstByteValue * 256 + Byte.toUnsignedInt(input[offset + 1]);
        appendItemDebugMsg("Mode3A (decimal)", this.mode3AReply);
        appendItemDebugMsg("Mode3A (octal)", this.getMode3AReplyOctal());

    }

    public int getMode3AReply() {
        return mode3AReply;
    }

    public String getMode3AReplyOctal() {
        return ModeACode.toOctal(this.getMode3AReply());
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item070 - Mode-3/A Code in Octal Representation";
    }

}
