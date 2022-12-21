package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; //32 bits xwro
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Integer Minimum Value = " + myMinIntValue);

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE; //Byte xrisimopoiei 8 bits diladi width of 8
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; // 16 bits xoro
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 100L; //width of 64 bits 2 eis tin 63

        long myMinLongValue = Long.MIN_VALUE; // 16 bits xoro
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);
        
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);


    }
}
