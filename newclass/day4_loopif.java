package newclass;

public class day4_loopif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//task 1
		System.err.println("===================task 1=====================");
		for (int i=0;i<=2;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(i +"->" +j+"  ");
				
			}
			System.out.println();
		}
     System.err.println("==================task 2=======================");
		
		// task 2
		int a=5553241;
		int d=0;
		for(int i=0;a>0;i++) {
		d+=a%10;
		a=a/10;
		}		
		System.out.println(d);
		
	//	if condition
		System.out.println("--------------if condition----------------");
		
		if(10>5) {
			System.out.println("hello");
		}
	// if else
		System.out.println("----------------if else---------------");
		if(10>8) {
			System.out.println("greater then");
		}else {
	      	System.out.println("less then");	
		}
		
		System.out.println("------------if else ladder----------------");
		int e=10;
		if(e==0) {
			System.out.println("0 is equal to e");
		} else if(e==9) {
			System.out.println("9 is equal to e");
		}else if(e==10) {
			System.out.println("10 is equal to e");
		}else {
			System.out.println("not equal");
		}
		
		System.out.println("-------------nested if else------------------");
		boolean o=false;
		if(true) {
			if(true==true) {
				System.out.println("its true");
			}
		}else {
			System.out.println(" its false" );
		}
		
		// loops
		System.out.println("-------------------for loop----------------");
		// for loop
		int f=5;		
		
		for(int i=0;i<f;i++) {
			System.out.println("hello sanjay");
		}
		
		int[] arr= {1,2,5,7,9,12};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;) {
			System.out.print(arr[i]+" ");
			i++;
		}
		
		System.out.println();
		System.out.println("-------------------while loop-----------------------");
		int w=0;
		while(arr.length>w) {
			System.out.println(arr[w]);
			w++;
		}
		System.out.println("---------------------do while------------------------");
		int c=0;
		do {
			System.out.println("its do while");
		c++;
		}while(4>c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
