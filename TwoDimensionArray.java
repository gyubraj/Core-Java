
package com.arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int x[]={2,3,4,5};
        int y[]={12,13,14,15};
        int z[]={22,23,24,25};
        
        int p[][]={
            {2,3,4,5},{12,13,14,15},{22,23,24,25}
                   };
                                  //2D array
    for(int i=0;i<3;i++){
    for(int j=0;j<4;j++){
        System.out.print(p[i][j]+" ");
    }
        System.out.println("");
}
    
    //Enhanced For loop for 2D Array
        System.out.println("Using Enhanced for loop");
        for(int i[]:p)
        {
          for(int j: i){
              System.out.print(j+" ");   
          }  
            System.out.println("");
        }
    
}
    
}
