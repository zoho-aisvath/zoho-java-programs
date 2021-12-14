//different types of excpetion handling in java 
// try- catch , multiple catch blocks and nested try catch

import java.util.*;
import java.io.*;

public class prog32a{
	public static void main(String args[]){
		try{
			int a=30/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("The rest of the code");
	}
}