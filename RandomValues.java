
package com.arrays;

import java.util.Random;

public class RandomValues {
     public static void main(String[] args) {
        int number[]=new int[5];
        Random rd=new Random();
        for(int i=0;i<number.length;i++)
            number[i]=rd.nextInt(100); //it will assign random values from 0 to 99
        System.out.println("Your Random number:");
        for(int i: number)    //this is called enhanced for loop
            System.out.println(i);
    }
}
