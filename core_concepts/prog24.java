import java.util.*;
import java.io.*;

//main method can be overloaded
 
//JVM always looks for main method with string type array as parameter first, the program 
//will compile but will not run

//flow of execution-  static blocks and then the static methods (main starts first)


//newer versions don't allow execution of java program wiothout main method, but it can happen
//by using static block, which is run first
public class prog24{
	public static void main(String args[]){
		//String args stores the command line arguments
		//String...args allows it to accept 0 or multiple arguments 
		System.out.println("Main method entered : ");
		System.out.println("Overloading it will give : ");
		main(100);
	}	
	public static void main(int x){
		System.out.println("Overloaded main method with an argument = "+x);
	}
}