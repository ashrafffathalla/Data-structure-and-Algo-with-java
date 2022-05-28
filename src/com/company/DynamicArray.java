package com.company;

import java.util.Arrays;

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
    public void  put(int element){
        // What about capacity to add element
        ensureCapacity(size+1);
        data[size++]=element;
    }


    //ensure Capacity to add element
    public  void  ensureCapacity(int minCapacity)
    {
        int oldCapacity = data.length;
        if (minCapacity>oldCapacity){
            int newCapacity = oldCapacity*2;
            if (newCapacity<minCapacity)
                newCapacity = minCapacity;
            data = Arrays.copyOf(data,newCapacity);
        }
    }
}
