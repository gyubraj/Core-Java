
package loops;

import java.util.Scanner;
//perfect number means if we add all it's divisor then it's same as number

public class PerfectNumber {
    
    public static void main(String[] args) {
        
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int total=0;
        for(int i=1;i<=number/2;i++){
          if(number%i==0)
              total=total+i;
        }
        if(total==number)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }
}
