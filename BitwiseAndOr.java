
package telesko;

public class BitwiseAndOr {
   
    public static void main(String[] a){
        int num1=25; // 1 1 0 0 1
        int num2=17; // 1 0 0 0 1
        int num3=num1&num2; // 1 0 0 0 1
        System.out.println("Bitwise and is "+num3);
        int num4=num1 | num2; // 1 1 0 0 1
        System.out.println("Bitwise OR is "+num4);
        
    }
}
