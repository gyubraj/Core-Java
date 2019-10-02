
package telesko;

public class LeftShiftRightShift {
    
    public static void main(String[] a){
        
        int num1=8; // 1 0 0 0
        int num2= num1<<2;// LeftShift Operator
        // 1 0 0 0 0 0 ->32
        System.out.println("After leftshift by 2:"+num2);
        
        num2=num1>>2; //RightShift Operator
        // 1 0 ->2
        
        System.out.println("After RightShift bt 2:"+num2);
    }
    
}
