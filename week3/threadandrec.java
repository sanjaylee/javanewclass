package week3;

// thread
class sanjay implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i am sanajy");
		}		
	}	
}
class sanjay1 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("hello !!!!!!!");
		}		
	}	
}



class parent{
	static class child{
		void hello() {
			System.out.println("hello i am child class");
		}
	}
}

public class threadandrec {
	
    //recsion factorial
	
    static public int fact(int a) {
		if(a==1) {
			return 1;
		}
		return a*fact(a-1);
		
	}
    
    //recursion in java reverse number
	
    static void rev(int a) {
    	
    	if(a==0) {
    		return;
    	}
    	System.out.print(+a%10+",");
    	rev(a/10);
    }
    
    static void fob(int num) {
    System.out.println("fibonacci =");
    	int first=0;
    	int second=1;
    	for(int i=0;i<num;i++) {
    		System.out.print(first+",");
    		int temp=first+second;
    		first=second;
    		second=temp;
    	}
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       fob(10);
       System.out.println();
		System.out.println("factorial number ="+fact(5));
		
		rev(34567);
		System.out.println();
//		parent.child pc=new parent().new child();
		parent.child pc=new parent.child();
		pc.hello();
		
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		sanjay sa=new sanjay();
		sanjay1 sa1=new sanjay1();
		
		Thread th1=new Thread(sa1);
		Thread th=new Thread(sa);
		th.start();
		th1.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
