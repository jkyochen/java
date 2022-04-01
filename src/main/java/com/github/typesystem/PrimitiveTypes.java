package com.github.typesystem;

public class PrimitiveTypes {

    // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    // a 8-bit signed two's complement integer.
    // byte >= -128 <= 127
    // >= -2^7  <= 2^7-1
    static byte aByte = -128;
    static byte aByteDefaultValue;

    // a 16-bit signed two's complement integer.
    // >= -32768 <= 32767
    // >= -2^15  <= 2^15-1
    static short aShort = (short) ((short) Math.pow(2, 15) - 1);
    static short aShortDefaultValue;

    // a 32-bit signed two's complement integer.
    // >= -2^31  <= 2^31-1
    static int anInt = (int) (Math.pow(2, 31)) - 1;
    static int aIntDefaultValue;

    // a 64-bit two's complement integer.
    // >= -2^63  <= 2^63-1
    static long aLong = (long) (Math.pow(2, 63)) - 1;
    static long bLong = 1L;
    static long aLongDefaultValue;

    // Never be used for precise values
    // a single-precision 32-bit IEEE 754 floating point.
    static float aFloat = 1f;
    static float aFloatDefaultValue;
    // a single-precision 64-bit IEEE 754 floating point.
    static double aDouble = 1d;
    static double aDoubleDefaultValue;

    static boolean aBoolean = true;
    static boolean aBooleanDefaultValue;

    // a single 16-bit Unicode character.
    // a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
    static char aChar = 'a';
    static char aCharDefaultValue;

    // The number 26, in decimal
    int decVal = 26;
    //  The number 26, in hexadecimal
    int hexVal = 0x1a;
    // The number 26, in binary
    int binVal = 0b11010;

    long creditCardNumber = 1234_5678_9012_3456L;
    long socialSecurityNumber = 999_99_9999L;
    float pi =  3.14_15F;
    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_BABE;
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    byte nybbles = 0b0010_0101;
    long bytes = 0b11010010_01101001_10010100_10010010;

    int x3 = 5_______2;

    public static void main(String[] args) {
        System.out.println("aByte " + aByte);
        System.out.println("aDefaultByte " + aByteDefaultValue);
        System.out.println("aShort " + aShort);
        System.out.println("aDefaultShort " + aShortDefaultValue);
        System.out.println("anInt " + anInt);
        System.out.println("aIntDefaultValue " + aIntDefaultValue);
        System.out.println("aLong " + aLong);
        System.out.println("aLongDefaultValue " + aLongDefaultValue);
        System.out.println("aFloat " + aFloat);
        System.out.println("aFloatDefaultValue " + aFloatDefaultValue);
        System.out.println("aDouble " + aDouble);
        System.out.println("aDoubleDefaultValue " + aDoubleDefaultValue);
        System.out.println("aBoolean " + aBoolean);
        System.out.println("aBooleanDefaultValue " + aBooleanDefaultValue);
        System.out.println("aChar " + aChar);
        System.out.println("aCharDefaultValue " + aCharDefaultValue);
        System.out.println("aCharDefaultValue == " + (aCharDefaultValue == 0));

        // 0.30000000000000004
        System.out.println(0.1 + 0.2);
    }

}
