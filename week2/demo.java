package week2;

import java.util.Arrays;

public class demo {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		int [] a1= {1,2,3,1,2,3,3,1,1,2,5,6,2,7};
//		  int count=0;
//		  int  index=0;
//		   for (int i = 0; i < a1.length; i++) {
//			for (int j = i+1; j < a1.length; j++) {
//				if(a1[i]==a1[j]) {
//					System.out.print(a1[j]+",");
//					count++;
//					break;
//				}
//			}		   
//			if(count>1) {
//				index++;
//				count=0;
//			}
//		}
//		   System.out.println();
//		  System.out.println(count);
//		   System.out.println(index);
//	System.out.println();
//		   
//	
//	
//		   int []a = {1,2,3};
//		   for(int i=0;i<a.length/2;i++) {
//			   int bkg=a[i];
//			   a[i]=a[a.length-1-i];
//			   a[a.length-1-i]=bkg;
//		   }
//		   
//		   System.out.println(Arrays.toString(a));
//		   
		
		
		int [] a1= {1,2,4,6,8,33,2,66,1,33,4,33,2,1,1,8,9};
	   Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		  int count=1;
		  int  index=0;
		  int ele=0;
		   for (int i = 0; i < a1.length; i=index) {
			for (int j = i+1; j < a1.length; j++) {
				if(a1[i]==a1[j]) {
					count++;
				}
			}
			index+=count;
			if(count>1) {
			System.out.println(a1[i]+"=>"+count);
			ele++;
			count=1;
			
			}
		}
System.out.println(ele);		   
	}



}
