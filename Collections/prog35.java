//HashTable implementation 


//major differences between hashtable and hashmap is : 
//hashtable is synchronized and does not allow any null key or null values , hashtable is slow

//hashtable inherits dictionary class and implements map interface
//whereas hashmap inherits the map interface only

import java.util.*;
import java.io.*;

public class prog35{
	public static void main(String args[]){
		Hashtable<Integer,String> Map=new Hashtable<Integer,String>();	
		//put method to add a particular key value pair to map
		Map.put(100,"Aisvath");
		Map.put(100,"kumar");	//replaces the initially entered key value pair
		Map.put(200,"Adhi");
		Map.put(300,"Anuraag");
		Map.put(400,"Akhil");
		Map.put(500,"arun");
		System.out.println(Map);
		System.out.println("---------------");
		//removing elements from a hashtable;
		System.out.println("Removing an element with key 300");
		Map.remove(300);

		System.out.println(Map);
		System.out.println("---------------");
		//for printing the map in a customized way : 
		for(Map.Entry m:Map.entrySet()){
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		//replacing a value in a hashtable
		System.out.println("Replace the value of 100 : ");
		Map.replace(100,"Messi");
		System.out.println("---------------");
		System.out.println(Map);
	}
}

