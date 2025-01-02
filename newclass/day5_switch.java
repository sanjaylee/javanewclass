package newclass;

public class day5_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("=======================task=====================");
		for(int i=1;i<=3;i++) {
			for(int j=i;j<=3;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				if(j==1||i==3) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}

			for(int j=1;j<=i;j++) {
				if(i==3||i==j) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------for loop---------------------");
     String[] str= {"sanjay","lee","arun","ram"};
     for(String s:str) {
    	 System.out.println(s);
     }
     System.out.println("----------------------for loop with break---------------");
     for(int i=0;i<8;i++) {
    	 System.out.println(i);
    	 if(i==4) {
    		 System.out.println("break");
    		 break;
    	 }
     }
     System.out.println("----------------for loop with continue----------------------");
     for(int i=0;i<5;i++) {
    	 if(i==3||i==2) {
    		 
    		 continue;
    	 }
    	 System.out.println(i);
    	
     }
     System.out.println("=====================switch case=================");
     switch(str[2]) {
       
     case "sanjay":
    	 System.out.println("i am sanjay");
    	 break;
     case "lee":
    	 System.out.println("i am lee");
    	 break;
     case "dharan":
    	 System.out.println("i am dharan");
    	 break;
     default:
    	 System.out.println("i am default method");
    	 break;
     }
     System.out.println("-----------------star pattern program----------------");
     int col=1;
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<col;j++) {
    		 System.out.print("*"+" ");
    	 }
    	 System.out.println();
    	 col+=2;
    	 
     }
     System.out.println();
    
     int col1=7;
     for(int i=0;i<5;i++) {
    	 for(int j=0;j<col1;j++) {
    		 System.out.print("*"+" ");
    	 }
    	 System.out.println();
    	 col1-=2;
    	 
     }
     
     for(int i=1;i<=5;i++) {
    	 for(int j=1;j<=i;j++) {
    		 System.out.print(j+" ");
    	 }
    	 System.out.println();  	 
     }
     
     
     
     
     
     System.out.println();
     for(int i=1;i<=5;i++) {
    	 int p=5;
    	 for(int j=1;j<=i;j++) {
    		 System.out.print(p--+" ");
    	 }
    	 System.out.println();  	 
     }
     System.out.println();
     int count=10;
     for(int i=1;i<=5;i++) {
    	 for(int j=i;j<=5;j++) {
    		 System.out.print(count+" ");
    		 count++;
    	 }
    	 System.out.println();  	 
     }
     System.out.println();
     
     for(int i=1;i<=5;i++) {
    	 for(int j=i;j<5;j++) {
    		 System.out.print("  ");
    	 }
    	 for(int j=1;j<=i;j++) {
    		 System.out.print("*"+" ");
    	 }
    	 System.out.println();
     }
     
     
   
     
     
     
     
        
     
     
     
     
     
     
     
     
     
     
	}

}
