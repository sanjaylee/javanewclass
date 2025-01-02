package week2;

import java.util.Arrays;

abstract class sanjay{
	abstract void display();
	void show() {
		System.out.println("i am normal method ");
	}
	static void see() {
		System.out.println("i am static mehtod");
	}
}
class lee extends sanjay{
	@Override
	void display() {
	System.out.println("it is abstractt");
		
	}	
}
// interface
interface AB{
	void a();
	void b();
	static int c() {
		return 567;
	}
	default double d() {
		return 78.5672;
		
	}
}
interface CD extends AB {
	int a=90;
	default double d() {
		return 33.00;
	}
}
interface EF{
	void e();
}

class XY implements CD,EF{

	@Override
	public void a() {
		System.out.println("I AM INTERFACE MEHHOD");
	}
	@Override
	public void b() {
	System.out.println("I AM ALSO INTERFACE METHODS B");
		
	}
	@Override
	public void e() {
	    System.out.println("i am method of e");
		
	}
	
}

public class abstrandinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============abstration============");
          lee obj= new lee();
          obj.display();
          obj.show();
          obj.see();
          
        System.out.println("==============interface=============");  
          XY obj1= new XY();
          obj1.a();
          obj1.b();
          System.out.println(AB.c());
        System.out.println( obj1.d());
     
        
        int[] array= {10,20,30,40,50};
            int start = 0;
            int end = array.length - 1;

System.out.println("==========reverse the array========");          
            
             for(int i=start;i<end;) {  //  while (start < end) 
            	 int temp = array[start];           
                array[start] = array[end];
                array[end] = temp;

                start++;
                end--;
            }
        
        for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
        System.out.println();
      System.out.println("========prime number========");  
      
        int num=10;
        int count=0;
        for(int i=1;i<=num;i++) {
        	if(num%i==0) {
        		count++;
        	}
        }
        if(count==2) {
        	System.out.println("yes its a prime number");
        }else {
        	System.out.println("its not a prime number ");
        }
        
        
        
        
        
        
	
	}

}
