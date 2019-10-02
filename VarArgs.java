
package com.arrays;

/*

varargs--->Variable arguments 
when number of arguments are not fixed we can use this method
this is the feature of java 
 */
public class VarArgs {
    
    public static void main(String[] args) {
        
        VarArgs va=new VarArgs();
        va.show(2,3,4,5);
        va.show(1,8);
    }
    void show(int ...a){
        for(int i:a)
        System.out.println(i);
    }
    
}
