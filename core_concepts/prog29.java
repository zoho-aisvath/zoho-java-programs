//to print out the system properties using system class

import java.util.*;

public class prog29{
	public static void main(String args[]){
		System.out.println("System properties for the user are : ");
		Properties p=System.getProperties();
		System.out.println("--------------------------");
		System.out.println("User name : "+p.getProperty("user.name"));   //user's account name
		System.out.println("Home directory : "+p.getProperty("user.home"));	  //user's home directory		
		System.out.println("Current working directory : "+p.getProperty("user.dir"));	  //current working directory
		System.out.println("--------------------------");
		System.out.println("Os specifications ");
		System.out.println("--------------------------");
		System.out.println("Operating system name : "+p.getProperty("os.name"));
		System.out.println("Operating system architecture : "+p.getProperty("os.arch"));
		System.out.println("Operating system version : "+p.getProperty("os.version"));

	}
}