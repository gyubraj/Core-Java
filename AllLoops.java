
package loops;

public class AllLoops {
    
    public static void main(String args[]){
     AllLoops al=new AllLoops();
        System.out.println("Using For Loop:");
        al.forLoop();
        System.out.println("Using While Loop");
        al.whileLoop();
        System.out.println("Using Do while loop:");
        al.doWhileLoop();
    }
    
    void forLoop(){
    for(int i=0;i<10;i++)
            System.out.println("Value is "+i);
    }
    
    void whileLoop(){
       int  i=10;
        while(i<20){
            System.out.println("Value is:"+i);
            i++;
    }
    }
    void doWhileLoop(){
        
        int i=20;
        do{
            System.out.println("value :"+i);
            i++;
            
        }while(i<30);
        
    }
}
