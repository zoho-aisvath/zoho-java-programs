//program 15 to replace a substring in a string
import java.util.*;
import java.io.*;
public class prog15{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.nextLine();
		System.out.println("Enter the substring to be replaced : ");
		String s2=sc.nextLine();
		int x=s1.indexOf(s2);
		if(x==-1){
			System.out.println("The substring does not exixt!" );
		}
		else{
		
			System.out.println("Enter the value :");
			String s3=sc.nextLine();
			String s4 =s1.replace(s2,s3);
			System.out.println("The new string is = "+s4);
		}	
		
	}
}