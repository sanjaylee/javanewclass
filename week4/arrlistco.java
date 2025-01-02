package week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class arrlistco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> str=new ArrayList<>();
		str.add("sanjay");
		str.add("arun");
		str.add("sathish");
		str.add("dharan");
		str.add("vishnu");
		
		System.out.println(str);
		System.out.println(str.isEmpty());
		str.remove(1);
		System.out.println(str);
		
		str.add(02, null);
		System.out.println(str);
	   
		System.out.println(str.size());
		
	  
	  System.out.println(str.subList(1, 3));
		
	  str.forEach(e->{
		  System.out.println(e);
	  });
	  
	  Iterator<String> it= str.iterator();
	  while(it.hasNext()) {
		  System.out.println(it.next());
	  }
	  
      LinkedList<Integer> li=new LinkedList<Integer>();
	 li.add(null);
	 li.add(10);
	 li.add(20);
	 li.add(30);
	 li.add(40);
	 li.add(50);
	 li.add(30);
	 li.add(20);
	 li.add(10);
	 System.out.println(li);
	 
	 li.add(50);
	 System.out.println(li);
	  
	 System.out.println(li.subList(2, 4));
	 
	 li.remove(3);
	 System.out.println(li);
	 
	 li.addFirst(0);
	 System.out.println(li);
	 
	 li.removeLast();
	 System.out.println(li);
	 
	 li.poll();
	 System.out.println(li);
	  
	 System.out.println(li.lastIndexOf(8));
	 
	 
	 
	HashSet<Integer> se=new HashSet<Integer>();
	 se.add(null);
	 se.add(10);
	 se.add(20);
	 se.add(30);
	 se.add(40);
	 se.add(50);
	 se.add(30);
	 se.add(20);
	 se.add(10);
	 se.add(5);
	 System.out.println(se);
	 
	 se.add(50);
	 System.out.println(se);

     se.remove(5);
     System.out.println(se);

     
     List<Character> arr=List.of('a','s','d','t','o');
	 
     System.out.println(arr);
     
     Set<Integer> set=Set.of(123,3456,9987,23,7653,765);
     System.out.println(set);
     
     set.forEach(e->{
    	 System.out.println(e);
     });
     
     
	 
	 
	 
	}

}
