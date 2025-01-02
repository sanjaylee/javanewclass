package week2;

import java.util.Arrays;

public class conandacces {
// access modifiers
	private int num =8;
	private String name;
	public String str="sanjay";
	protected int age=21;
	
	int mark;
	String subject;
	char grade;
//parameterized constructoes		
	conandacces(int a,String s,char c){
		this.mark=a;
		this.subject=s;
		this.grade=c;
	}
// copy constructors
	public conandacces() {
		this(0,"desfault",'-');
	}
//Encapsulation	
	public int getNum() {
		return num;
	}
	public void setNum(int a) {
		this.num=a;
	}
	public String getNaame() {
		return name;
	}
	public void setName(String s) {
		this.name=s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" //parameterized constructoes	");	
		conandacces obj=new conandacces(80,"cs",'A');
		System.out.println(obj.mark);
		System.out.println(obj.subject);
		System.out.println(obj.grade);
System.out.println("// copy constructors");		
		conandacces obj3=new conandacces();
		System.out.println(obj3.mark);
		System.out.println(obj3.subject);
		System.out.println(obj3.grade);
		
 System.out.println("// access modifiers"); 		
		conandacces obj1=new conandacces();
		System.out.println(obj1.age);	
		System.out.println(obj1.num);
		System.out.println(obj1.str);
System.out.println("//Encapsulation	");
		obj1.setNum(21);
		System.out.println(obj1.getNum());
	    obj1.setName("note");
		System.out.println(obj1.getNaame());
			
System.out.println("//bubble sort	");
        
		int[] a= {1,6,9,3,5,7,2,4,2,6,7};    
		int[] te= new int[a.length];       
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
			    if(a[i]>a[j]) {
			    	int temp=a[i];
			    	a[i]=a[j];
			    	a[j]=temp;
			    }
			}
		}
		
System.out.println(Arrays.toString(a));
		


int a1[]= {1,2,6,3,2,8,22,6,99,99,99,5,3};
Arrays.sort(a1);
System.out.println(Arrays.toString(a1));
int count=1 ;
int index=1;
int count1=1;

for (int i = 0; i < a1.length;i=index) {
	for (int j = i+1; j < a1.length; j++) {
		if(a1[i]==a1[j]) {
			count++;
			count1++;
		}
	}
	index+=count;	
	if(count>1) {
		System.out.println(a1[i]+" ==> "+count);
		count=1;
     }
}
System.out.println("dubliacre count ="+count1);
		
		
		
	}

}
