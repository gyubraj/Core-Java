
package com.arrays;

import java.util.Scanner;


public class OneDimension {
  
    public static void main(String[] args) {
        
        int number[]=new int[5];
        System.out.println("Enter 5 numbers");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
            number[i]=sc.nextInt();
        System.out.println("Your Enterd Numbers:");
        for(int i=0;i<5;i++)
            System.out.println(number[i]);
    }
}
