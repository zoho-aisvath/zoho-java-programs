import java.util.*;
import java.io.*;

public class prog32c{
	public static void main(String args[]){
		try{
			try{
				 int a =100/0;    
			}
			catch(ArithmeticException e){
				System.out.println("Division by zero error");
			}
			try{
				int a[]=new int[10];
				a[10]=5;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("out of bounds ...");	
			}
		}
		catch(Exception e){
			System.out.println("Exception in the outer block occurs");
		}
		System.out.println("rest of the code");
	}
}