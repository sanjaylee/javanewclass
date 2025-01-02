package week3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filereadwrite {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		File fi=new File("san.csv");
		if(fi.createNewFile()) {
			System.out.println("EXCEL file is created");
		}else {
			System.out.println("EXCEL file already created");
		}

		try {
			FileWriter w = new FileWriter(fi.getPath());
			w.append("NAME,ACCOUNT NO,MOBILE NO,AGE \n");
			w.append("sanjay,123456,9025727757,21,\n");
			w.append("arun,113323456,3025727734,24 \n");
			w.append("sathish,3456123456,502572353,20 \n");
			w.append("dharan,14323456,62572775765,23 \n");
			w.append("sanjay,123456,9025727757,21 \n");	
			w.append("45678,123456,9025727757,2134567 ");	
					
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
			
		System.out.println("success");
		
		
		
		Scanner sc=new Scanner(fi);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		
	}

}
