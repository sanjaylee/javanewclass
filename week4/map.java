package week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class custArray implements Comparable<custArray>{
	Integer  num;
	String name;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	

	public custArray(Integer num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return "map [num=" + num + ", name=" + name + "]";
	}

	@Override
	public int compareTo(custArray o) {
		// TODO Auto-generated method stub
		return o.getName().compareTo(this.getName()); //desecnging order
	// return this.getName().compareTo(o.getName());  // ascending order	
	}
}

class num implements Comparator<custArray>{

	@Override
	public int compare(custArray o1, custArray o2) {
		// TODO Auto-generated method stub
		return o2.getNum().compareTo(o1.getNum());
	}
	
}
public class map {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<custArray> cuarr=new ArrayList<custArray>();
		cuarr.add(new custArray(1,"sanay"));
		cuarr.add(new custArray(2,"234"));
		cuarr.add(new custArray(3,"abc"));
		cuarr.add(new custArray(4,"xyz"));
		
		System.out.println(cuarr);
		
		Collections.sort(cuarr);
		
		System.out.println(cuarr);
		
	// object reference
		num nu=new num();
		Collections.sort(cuarr,nu);
		System.out.println(cuarr);
		
		
		
		System.out.println("=========map interface==========");
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "sanjay");
		map.put(2, "arun");
		map.put(3, "dharan");
		map.put(4, "sathish");
		map.put(5, "vishnu");
		map.put(6, "thirumalai");
		System.out.println(map);
		
		System.out.println(map.get(5));
		System.out.println(map.getOrDefault(7, "summa"));
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("sathis2h"));
		System.out.println(map.size());
		
		System.out.println("==========keys only==========");
		map.keySet().forEach(e->{
			System.out.print(e+", ");
		});
		System.out.println();
	System.out.println("============valuse only=======");
	    map.values().forEach(e->{
	    	System.out.print(e+" ,");
	    });
	    System.out.println();
	   System.out.println("============key and valuse both======"); 
	    
	    map.entrySet().forEach(e->{
	    	System.out.println(e.getKey()+" ");
	    	System.out.println(e.getValue()+" ");
	    });
	    
	    
	    
	    int[] a= {1,2,3,1,2,4,5,6,2,3,4,5,2,3};
	    Map<Integer,Integer> obj=new HashMap<Integer, Integer>();
	    
	    for(int i:a) {
	    	obj.put(i, obj.getOrDefault(i, 0)+1);
	    }
	    
	    System.out.println(obj);
	    obj.entrySet().forEach(e->{
	    	 if(e.getKey()==4) {    //given the condition  ex  e.getkey>4 or <
	 	    	System.out.println(e);
	 	    }
	    });
	   
	    System.out.println(obj);
	    obj.entrySet().forEach(e->{
	    	 if(e.getValue()==1) {    //given the condition != , 
	 	    	System.out.println(e);
	 	    }
	    });
	    
	    
	  
	}

}
