
package loops;
/*
1 2 3 4
2 3 4 1
3 4 1 2 
4 1 2 3 
*/

public class Pattern1 {
    public static void main(String[] args){
        
       for(int i=1;i<=4;i++){
   for(int j=0;j<=3;j++){
    if(i+j>4)
     System.out.print((i+j)-4);
    else
     System.out.print(i+j);
   }
   System.out.println("");
   }
    } 
}
