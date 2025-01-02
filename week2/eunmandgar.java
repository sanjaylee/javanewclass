package week2;

import java.util.Arrays;

enum days{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURESDAY,
	FRIDAY,	
}


public class eunmandgar {
   
	
	
	public void finalize() {
		System.out.println("garbade collected and cleared");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<10;i++) {
			eunmandgar obj=new eunmandgar();
		}
		
		
		eunmandgar obj=new eunmandgar();
		obj=null;
		System.gc();
		
		days day=days.valueOf("FRIDAY");
		System.out.println(day);
		System.out.println("=================ALL values=============");
	    for(days i:day.values()) {
	    	System.out.println(i);
	    }
	    System.out.println("============ switch case=================");
		switch(day) {
		 
		case MONDAY:
			System.out.println("date is monday");
			break;
			
		case TUESDAY:
			System.out.println("date is tuesday");
			break;
		case WEDNESDAY:
			System.out.println("date is wednesday");
			break;
		case THURESDAY:
			System.out.println("date is thurday");
			break;
		case FRIDAY:
			System.out.println("date is friday");
			break;
		default:
		   System.out.println(" no days");	
		   break;
		   
		  
		}
		 System.out.println("========exception handling============");
		     int []arr=null;  
		 try {
			 System.out.println(arr[2]);
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		 
		 
		 
		 
		 
		 

	}

}
