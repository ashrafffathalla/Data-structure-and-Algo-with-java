package com.company;

public class SimpleArray
{
    public static void main(String[] args) {
        // One Dimesion Array
        int[] number = new int[5];
        number[0]=11;
        number[1]=2;
        number[2]=4;
        number[3]=44;
        number[4]=55;
        System.out.println("Simple Array");
        for (int i=0;i<number.length;i++)
            System.out.println(number[0] + "\n");
    }
}
