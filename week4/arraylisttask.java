package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class students implements Comparable<students> {
	String name;
	Integer mark1;
	Integer mark2;
	Integer mark3;
	Integer total;
	Integer ang;
	public students(String name, Integer mark1, Integer mark2,
			Integer mark3,Integer total, Integer ang) {
		super();
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.total = total;
		this.ang = ang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMark1() {
		return mark1;
	}

	public void setMark1(Integer mark1) {
		this.mark1 = mark1;
	}

	public Integer getMark2() {
		return mark2;
	}

	public void setMark2(Integer mark2) {
		this.mark2 = mark2;
	}

	public Integer getMark3() {
		return mark3;
	}

	public void setMark3(Integer mark3) {
		this.mark3 = mark3;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getAng() {
		return ang;
	}

	public void setAng(Integer ang) {
		this.ang = ang;
	}



	@Override
	public String toString() {
		return "students [name=" + name + ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", total="
				+ total + ", ang=" + ang + "]";
	}

	@Override
	public int compareTo(students o) {
		// TODO Auto-generated method stub
		return o.getTotal().compareTo(this.getTotal());
	}
	
	
}

class mark3 implements Comparator<students>{

	@Override
	public int compare(students o1, students o2) {
		// TODO Auto-generated method stub
		return o2.getMark3().compareTo(o1.getMark3());
	}
	
}




public class arraylisttask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<students> st=new ArrayList<students>();
		
		st.add(new students ("sanjay",80,93,60,223,74));
		st.add(new students ("arun",90,93,40,224,77));
		st.add(new students ("vishnu",60,65,80,205,68));
		st.add(new students ("thirumalai",70,33,60,163,54));
		
//		System.out.println(st);
		Collections.sort(st);
	    System.out.println(st);	
	     st.forEach(e->{
	    	 System.out.println(e);
	    	 
	     });
	     
	     System.err.println("===============sort by higest total============================");
	   java.util.Iterator<students> it=st.iterator() ;
	     while (it.hasNext()) {
	    	 System.out.println( it.next());
	    	 System.out.println();
			break;
		}
	     System.out.println();
	    
	     mark3 m3=new mark3();
		Collections.sort(st, m3);
		st.forEach(e->{
			System.out.println(e);
		});
		  System.err.println("===============sort by higest mark3============================");
		   java.util.Iterator<students> it1=st.iterator() ;
		     while (it1.hasNext()) {
		    	 System.out.println( it1.next());
		    	 System.out.println();
				break;
			}
		     System.out.println();
	}

}
