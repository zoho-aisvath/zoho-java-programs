//program 12 to eliminate numeric values in a string
import java.util.*;
import java.io.*;
public class prog12{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.nextLine();
		char arr[]=s1.toCharArray();
		System.out.println("After eliminating numeric values , it is :\n");
		for(int i=0;i<arr.length;i++){
			if(!Character.isDigit(arr[i])){
				System.out.print(arr[i]);
			}
		}
	}

}