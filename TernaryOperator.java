package telesko;
public class TernaryOperator {
    public static void main(String[] a){
        int i=3;
        int j =24;
         
        /*if(i==3)
        j= 43;
        else
        j=100;
        */
        
        j=i==3?43:100; //This is called Ternary operator
        System.out.println("Value of j is :"+j); 
        
        //Showing Ternary can't replace ifelse everytime
        Object obj1;
        Object obj2;
        if(true)
            obj1=new Integer(10);
        else
            obj1=new Double(15.0);
        System.out.println(obj1); // Output will be 10
        System.out.println("After Ternary");
        //Lets try with ternary operator
        obj2=true?new Integer(10):new Double(15.0);
        System.out.println(obj2); //Output will be 10.0
        
        
        
        
    }
    
}
