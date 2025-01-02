package week3;

import java.util.Scanner;


class myexception extends Exception {
	myexception(String err){
	super(err);
	}
}
class task{
	public void san() throws myexception {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < size; i++) {
		try {
		System.out.println("enter the elements");
		arr[i]=sc.nextInt();
		}catch(Exception e) {
			throw new myexception("invalid input enter the valid input");
		}
	
	}
	
	}
}
public class excepandscann {

	public static void main(String[] args) throws myexception  {
		// TODO Auto-generated method stub
	         task ta=new task();
		try {
			ta.san();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			ta.san();
		}

		System.out.println("sanjay");
		System.out.println("sanjay");
		System.out.println("sanjay");
		System.out.println("sanjay");
		System.out.println("sanjay");
	}
	

}
