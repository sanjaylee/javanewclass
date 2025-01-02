
package week2;
//task

	
public class inherandpol {

	int a=10;
	protected String str="wertyufdsdfghj"; 
	public String mail="xyz@gmail.com";
	private double pri=79.32;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherandpol obj= new inherandpol();
         System.out.println(obj.a);
		System.out.println("public  "+obj.mail);
		System.out.println("protected "+obj.str);
		System.out.println("private "+obj.pri);
	}

}
