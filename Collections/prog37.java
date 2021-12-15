//Set interface in java
//contains Hashset LinkedhashSet and treeSet

import java.util.*;
import java.io.*;

public class prog37{
	public static void main(String args[]){
		HashSet<String> a=new HashSet<String>();
		a.add("John");
		a.add("Jane");
		a.add("Aaron");
		a.add("Leo");
		a.add("Steve");
		a.add("Tony");
		a.add("John");
		System.out.println("The Set here is : ");
		System.out.println(a);
		System.out.println("We can also remove elements ");
		System.out.println("After removing the element Aaron");
		a.remove("Aaron");
		//adding a linked list to the set
		LinkedList<String> l=new LinkedList<String>();
		l.add("Aisvath");
		l.add("Kumar");
		a.addAll(l);
		System.out.println(a);

	}
}