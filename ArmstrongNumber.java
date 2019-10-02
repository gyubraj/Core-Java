
package loops;

import java.util.Scanner;

/*

     153=1 5 3
         1*1*1 + 5*5*5 + 3*3*3
         1 + 125 + 27
         153
 */
public class ArmstrongNumber {
    
    public static void main(String[] args) {
        
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean b=isArmstrong(number);
        if(b)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number isn't Armstrong");
    }
    public static boolean isArmstrong(int number){
       int total=0; 
      int temp=number;
      while(number>0){
          int remainder=number%10;
          total=total+remainder*remainder*remainder;
          number=number/10;
    }
      if(total==temp)
          return true;
      return false;
    }
    
}
