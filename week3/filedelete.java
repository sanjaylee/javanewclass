package week3;

import java.io.File;

public class filedelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fi=new File("san.csv");
		
		if(fi.delete()) {
			System.out.println("delete success");
		}else {
			System.out.println("this file already delete");
		}
		
		
	}

}
