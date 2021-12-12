//program 6 to find out the length of the given string.
//without using in built methods
import java.util.*;
import java.io.*;
public class prog6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to : ");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int len=0;
		for(char c:arr){
			len++;
		}
		System.out.println("Length of the string entered is = "+len);
	}
}