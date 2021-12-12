//program 18 to concatenate 2 strings
import java.util.*;
import java.io.*;
public class prog18{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.nextLine();
		System.out.println("Enter the string2 : ");
		String s2=sc.nextLine();
		System.out.println("Concatenated string is ="+s1+s2);
		String s3=s1+s2;
		System.out.println(s3);
		System.out.println(s1.concat(s2));
	}
}