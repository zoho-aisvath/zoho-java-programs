//List interface in java

import java.util.*;
import java.io.*;


//ArrayList maintains the insertion order 
public class prog36{
	public static void main(String args[]){
		List<String> l=new ArrayList<String>();
		l.add("aisvath");
		l.add("chris");
		l.add("peter");
		l.add("meg");
		l.add("lois");
		l.add("Brian");
		l.add("Stewie");
		System.out.println("The entered list is : ");
		System.out.println("----------------------");
		System.out.println(l);
		//iterating through the list :
		Iterator itr=l.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n");			
		System.out.println("----------------------");
		System.out.println("after removing chris : ");
		l.remove("chris");		
		System.out.println(l);
		System.out.println("----------------------");
		System.out.println("After sorting the list : ");		
		Collections.sort(l);
		System.out.println(l);
		System.out.println("----------------------");
		System.out.println("\n\n\n");


		System.out.println("Linked list implementation");
		LinkedList<String> s=new LinkedList<String>();
		s.add("aisvath");
		s.add("chris");
		s.add("peter");
		s.add("meg");
		s.add("lois");
		s.add("Brian");
		s.add("Stewie");
		System.out.println("The entered list is : ");
		System.out.println("----------------------");
		System.out.println(s);
		System.out.println("----------------------");
		System.out.println("It also implements the queue interface for added methods");
		System.out.println("We can remove first element and then add last element also");
		s.removeFirst();
		System.out.println(s);
		s.addLast("addedLastElement");
		System.out.println(s);
	}
}