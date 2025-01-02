package newclass;

public class day2_typec_meth {

// type casting
	
	//widening  casting
	long a=12345;
	float b=a;
	
	//narrowing casting
	float c=12.34f;
	int d=(int)c;
	
	//void method
	void sanjay() {
		System.out.println("hii i am void method");
	}
	//non void method
	int sanjay2() {
		System.out.println("hii i am non void method");
		return 00000;
		
	}
	//void method with parameter
	void sanjay3(int a,float b) {
		System.out.println(a+b);
	}
	//non void method with parameter
	int sanjay4(int a,int b ) {
		return a-b;
	}
	
	// static method example
	
	static void lee(double d,float f) {
		System.out.println("i ma stataic method ");
		System.out.println(d+f);
	}
	
	static long lee2(int i,long l) {
		return i-l;
	}
	
	//
	int san() {
		return san2();
	}
	int  san2() {
		
		return 2024;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day2_typec_meth d2=new day2_typec_meth();
		
		System.out.println("============== type casting==========");
		System.out.println(d2.b);
		System.out.println(d2.d);
		System.out.println("================ void and non void method===============");
		//void method calling
		d2.sanjay();
		//non void method calling
		System.out.println(d2.sanjay2());
	  
		//non void method calling
		 System.out.println(d2.sanjay2());
		 System.out.println("===========void and non void method with parameter========");
		 
		//void method with parameter
		d2.sanjay3(05, 21);
			
		//non void method with parameter
		System.out.println(d2.sanjay4(23, 60));
		
		System.out.println("===========static method============");
		// static method calling		
		day2_typec_meth.lee(23.43, 78);
		System.out.println(day2_typec_meth.lee2(34, 22230));
		
		System.out.println(d2.san());
		System.out.println("===============unary operator===========");	
		System.out.println("increment operator");
		int a=10;
		System.out.println(a++);
		System.out.println(++a);
		
		System.out.println("decrement operator");
		int b=10;
		System.out.println(b--);
		System.out.println(--b);
		
		System.out.println("examble of increment and decrement opreator");
		int c= ++a + b-- - --b + a++;
		System.out.println(c);
		
	}

}
