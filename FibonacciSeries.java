
package loops;

public class FibonacciSeries {
    public static void main(String a[]){
     
        int i=0,total=0;
        int j =1;
        for(int k=0;k<=10;k++){
        total=i+j;
        i=j;
        j=total;
            System.out.println("    "+total);
        }
    }
}
