
package loops;

import java.util.Scanner;


public class PrimeNumber {
    
    public static void main(String[] args) {
        
        System.out.println("Enter Number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean b=isPrime(number);
        if(b)
            System.out.println("Number is prime");
        else
            System.out.println("Number isn't Prime");
    }
    
    static boolean isPrime(int number){
        for(int i=2;i<=number/2;i++){
            if(number%i==0)
                return false;      
    }
      return true;   
    }
}
