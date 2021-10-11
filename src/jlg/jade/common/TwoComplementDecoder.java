package jlg.jade.common;

public class TwoComplementDecoder {

    public static int decodeFromTwoBytes(byte[] input, int offset) {
        int result = input[offset] * 256
                + Byte.toUnsignedInt(input[offset + 1]);

        return result;
    }

    public static int decodeFromThreeBytes(byte[] input, int offset) {
        int result = input[offset] * 256 * 256
                + Byte.toUnsignedInt(input[offset + 1]) * 256
                + Byte.toUnsignedInt(input[offset + 2]);

        return result;
    }

    public static int decodeFromOneByte(byte[] input, int offset) {
        int result = input[offset];

        return result;
    }

    public static int decodeFromFourBytes(byte[] input, int offset) {
        int result = input[offset] * 256 * 256 * 256
                + Byte.toUnsignedInt(input[offset + 1]) * 256 * 256
                + Byte.toUnsignedInt(input[offset + 2]) * 256
                + Byte.toUnsignedInt(input[offset + 3]);

        return result;
    }
}
