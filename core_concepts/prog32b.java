import java.util.*;
import java.io.*;

// multiple catch block statements 

public class prog32b{
	public static void main(String args[]){
		try{
			int a[]=new int[5];
			a[5]=100/0;
			System.out.println("hey");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic excpetion occurs here");
			//after one exception occurs , it does not execute the rest of try block statements
		}
		catch(ArrayIndexOutOfBoundsException e){  
                    System.out.println("ArrayIndexOutOfBounds Exception occurs here");  
                }    
                catch(Exception e){  
                    System.out.println("Parent Exception occurs here");  
                }             
                System.out.println("rest of the code");
	}
}