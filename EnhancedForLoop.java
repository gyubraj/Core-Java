
package com.arrays;

import java.util.Scanner;

public class EnhancedForLoop {
 
    public static void main(String[] args) {
        int number[]=new int[5];
        System.out.println("Enter 5 numbers");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<number.length;i++)
            number[i]=sc.nextInt();
        System.out.println("Your Entered number:");
        for(int i: number)    //this is called enhanced for loop
            System.out.println(i);
    }
}
