package newclass;

public class day3_opera {
	
	 static int d=12;
	void sanjay(int c) {
	
		System.out.println(c);
	}

	void sanjay1(day3_opera a) {
		a.d=67;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		day3_opera obj = new day3_opera();
	    obj.sanjay(d);
	    
	    
	    day3_opera obj1 = new day3_opera();
	    obj.sanjay1(obj1);
	    System.out.println(obj1.d);
	    
	    
	    
		//Arithmetic operator + - * % /
	    System.out.println("=============Arithmetic operator + - * % /===============");
		
		int a=20;
		int b=30;
		String str="hello";
		System.out.println(a+b);
        System.out.println(str+b+a);
        System.out.println(a+b+str);
        System.out.println(a-b);
        System.out.println(b*a);
        System.out.println(a/b);
        
        // relational or comparison operator 
        System.out.println("===============relational or comparison operator==============");
        
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        
        //logic operators
        System.out.println("==================logic operators=========================");
        boolean not=true;
        System.out.println(a>b && a<b);
        System.out.println(a>b || a<b);
        System.out.println(!not);
        System.out.println(a>b || a<b && a>=b &&a<b|| a!=b);
        
        // //terynary operator 
        
        System.out.println("==================terynary operator =====================");
        
        String s=17>20 ? "major":"minor";
        System.out.println(s);
        
        
        
        
        
	}

}
