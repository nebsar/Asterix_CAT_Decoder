/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlg.jade.asterix.cat021.item110;

import jlg.jade.asterix.DecodingNotImplemented;
import jlg.jade.asterix.FixedLengthAsterixData;
import jlg.jade.asterix.RepeatableAsterixData;

/**
 *
 * @author beni.morgan
 */
class Cat021Item110Subfield2 extends RepeatableAsterixData {

    @Override
    protected int setRepeatableBlockSizeInBytes() {
        return 16;
    }

    @Override
    @DecodingNotImplemented(reason = "Item not needed yet")
    protected void decodeFromByteArray(byte[] input, int offset) {
        appendNotImplementedMsg();
    }

    @Override
    protected String setDisplayName() {
        return "Cat021Item110Subfield2 - Trajectory Intent Data";
    }
}
