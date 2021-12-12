//program 14 to replace a characetr in a given string
//could simply be done using replace method of string class , but here I've converted to char array
import java.util.*;
import java.io.*;
public class prog14{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.nextLine();
		System.out.println("Enter the character to be replaced : ");
		char replace_char=sc.next().charAt(0);
		System.out.println("Enter the character to be added instead : ");
		char added_val=sc.next().charAt(0);
		char arr[]=s1.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==replace_char){
				arr[i]=added_val;
			}
		}
		String s2=String.valueOf(arr);
		System.out.println("The new string is = "+s2);
	}
}