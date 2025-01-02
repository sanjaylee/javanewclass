package newclass;

import java.util.Arrays;

public class day6_programper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("=====================matrix program================");
	    int[][] x= {{1,2},{3,4}};
	    int[][] y= {{1,2},{3,4}};
	    
	    int [][] z=new int[2][2];
	    
	    for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z.length; j++) {
				for (int k = 0; k < z.length; k++) {
					z[i][j]+=x[i][k]*y[k][j];
				}
			}
		}	    
	    for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z.length; j++) {
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
	    System.err.println("===================today task============");         
	       // int z[][]={7,10},{15,22}};   
	        int[][] tar=new int[2][2]; 
	        
	        for (int i = 0; i < z.length; i++) {
				for (int j = 0; j < z.length; j++) {
					tar[j][i]=z[i][j];
				}
			}
	        for(int i=0;i<tar.length;i++) {
	        	for(int j=0;j<tar.length;j++) {
	        		System.out.print(tar[i][j]+" ");
	        	}
	        	System.out.println();
	        }

		System.out.println("================revese the number===============");
		int num=13578;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		System.out.println("=====================liner search================");
		
		int [] arr= {1,2,4,6,8,3,6,4};
		int find=8;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				System.out.println("index of 8= "+i);
			}
		}
		
		System.out.println("=====================binery search=================");
		
		int a[]= {1,3,6,54,6,2,88,5,4,7,6};
		int fi=0;
		int las=a.length-1;
		int mid=(fi+las)/2;
		int tr=6;
		Arrays.sort(a);
		 System.out.println(Arrays.toString(a));
		 
		 while(fi<las) {
			 if(a[fi]==tr) {
				 System.out.println("index of"+fi);
				 break;
			 }else if(a[las]==tr) {
				 System.out.println("index of"+las);
				 break;
			 }else if(a[mid]==tr) {
				 System.out.println("index of"+mid);
				 break;
			 }else if(a[mid]>tr) {
				 las=mid;
				 mid=(fi+las)/2;
			 }else {
				fi= mid;
				 mid=(fi+las)/2;
			 }
		 }
		 
		 System.out.println("==================dublicate count===================");
		 
			
			int [] a1= {1,2,4,6,8,33,2,66,33,4,33,2,1,1};
		   Arrays.sort(a1);
			System.out.println(Arrays.toString(a1));
			  int count=1;
			  int  index=0;
			   for (int i = 0; i < a1.length; i=index) {
				for (int j = i+1; j < a1.length; j++) {
					if(a1[i]==a1[j]) {
						count++;
					}
				}
				index+=count;
				if(count>1) {
				System.out.println(a1[i]+"=>"+count);
				
				count=1;
				}
			}
			   
			  
		 ///////////////////////////////////////////////////////////////////////////////////////
		 
		 
		
	}

}
