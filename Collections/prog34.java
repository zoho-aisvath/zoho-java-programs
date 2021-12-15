//Hashmap implementation 

import java.util.*;
import java.io.*;


public class prog34{
	public static void main(String args[]){
		HashMap<Integer,String> Map=new HashMap<Integer,String>();	
		//put method to add a particular key value pair to map
		Map.put(1,"Aisvath");
		Map.put(1,"kumar");	//replaces the initially entered key value pair
		Map.put(2,"Adhi");
		Map.put(3,"Anuraag");
		Map.put(4,"Akhil");
		Map.put(5,"arun");
		System.out.println(Map);
		System.out.println("---------------");
		//removing elements from a map;
		System.out.println("Removing an element with key 3");
		Map.remove(3);

		System.out.println(Map);
		System.out.println("---------------");
		//for printing the map in a customized way : 
		for(Map.Entry m:Map.entrySet()){
			System.out.println("The key is : "+m.getKey()+" and the value is : "+m.getValue());
		}
		//replacing a value in a hashMap
		System.out.println("Replace the value of 1 : ");
		Map.replace(1,"Ronaldo");
		System.out.println("---------------");
		System.out.println(Map);
	}
}
