
package com.swapping;

import java.util.Scanner;

/*
we will discuss all swapping methods
 */
public class SwappingMethods {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int number1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int number2=sc.nextInt();
        System.out.println("Before Swapping:");
        System.out.println("Number1 =" +number1+ "\nNumber2 ="+number2);
        simpleSwapping(number1,number2);
        complexSwapping(number1,number2);
        xorSwapping(number1,number2);
    }
    //let n1=12 and n2=13
    
    static void simpleSwapping(int n1,int n2){ 
        int temp=n1;    // temp-->12
        n1=n2;          // n1-->13
        n2=temp;        //n2-->12
        System.out.println("Using Simple Method:");
        System.out.println("Number1 =" +n1+ "\nNumber2 ="+n2);
        //requires 1 extra variable so more storage required
    }
    static void complexSwapping(int n1,int n2){
        n1=n1+n2;   // n1-->25
        n2=n1-n2;   //n2--->12
        n1=n1-n2;    //n1--->13
        System.out.println("Using Complex Method:");
        System.out.println("Number1 =" +n1+ "\nNumber2 ="+n2);
        //requires 1 extra bit ... waste memory
    }
    
    static void xorSwapping(int n1,int n2){
        n1=n1^n2;     // n1-->1 1 0 0 XOR n2->1 1 0 1 then n1-->0 0 0 1
        n2=n1^n2;     // n2-->0 0 0 1 XOR 1 1 0 1 then n2-->1 1 0 0 =12
        n1=n1^n2;     // n1-->0 0 0 1 XOR 1 1 0 0 then n1-->1 1 0 1 =13
        System.out.println("Using XOR Method:");
        System.out.println("Number1 =" +n1+ "\nNumber2 ="+n2);
        //best way as required less space 
        
    }
    
}
