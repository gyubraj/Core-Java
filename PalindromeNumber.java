
package loops;

import java.util.Scanner;

public class PalindromeNumber {
    
    public static void main(String[] a){
        int number,r,newNumber=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:       ");
        number=sc.nextInt();
        int virtualNumber=number;
        while(virtualNumber>0){
            r=virtualNumber%10;
            virtualNumber=virtualNumber/10;
            newNumber=newNumber*10+r;   
        }
        if(newNumber==number)
            System.out.println("Pallindrome");
        else
            System.out.println("Not Palindrome");
    }
}
