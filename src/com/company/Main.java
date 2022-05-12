package com.company;

public class Main {

    public static void main(String[] args) {
        // One Dimesion Array
	// write your code here
        int[] number = new int[5];
        number[0]=11;
        number[1]=2;
        number[2]=4;
        number[3]=44;
        number[4]=55;
        System.out.println("Simple Array");
        for (int i=0; i<number.length; i++)
            System.out.println(number[i]+"\t");

        // Array of objects
        Students[] student=new Students[3];
        student[0]= new Students("Ashraf",22);
        student[1]= new Students("Mohamed",66);
        student[2]= new Students("Ahmed",222);
        for (int i = 0; i<student.length; i++)
            System.out.println(student.length);
        for (Students students: student) {
            System.out.println(students.name+":"+ students.id);
        }
    }
}
