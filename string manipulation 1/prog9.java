//program 9 to copy one string to another
//by converting a string to an array of characters
import java.util.*;
import java.io.*;
public class prog9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you wish to copy : ");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		char arr2[]=new char[arr.length];
		for(int i=0;i<arr.length;i++){
			arr2[i]=arr[i];
		}
		String s2=String.valueOf(arr2);
		System.out.println("The copied string is in a new variable and is "+s2);
	}
}