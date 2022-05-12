package com.company;

public class DynamicArray
{
    int[] data;
    int size;
    public DynamicArray() {
        size=0;
        data = new int[1];
    }
    //method get
    public  int get(int index){
        return  data[index];
    }
}
