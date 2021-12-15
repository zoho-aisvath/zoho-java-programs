//properties class in java
//subclass of hashtable


//here i've gotten the system properties using the properties class 


import java.util.*;
import java.io.*;
	
public class prog38{
	public static void main(String args[]){		
		Properties p=System.getProperties();    
		for(Map.Entry m: p.entrySet()){
			System.out.println(m.getKey()+"  =   "+m.getValue());
		}		
	}
}