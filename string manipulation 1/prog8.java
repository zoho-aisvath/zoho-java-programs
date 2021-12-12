//program 1 to find out the number of special characters in a string
//side note , can also be done without Character.is() methods, but there would be a lot of looping
//and checking through process.
import java.util.*;
import java.io.*;
public class prog8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int n=arr.length;
		int numbers=0;
		int upper=0;
		int lower=0;
		int special=0;
		for(int i=0;i<n;i++){
			if(Character.isDigit(arr[i])){
				numbers++;
			}
			else if(Character.isUpperCase(arr[i])){
				upper++;
			}
			else if(Character.isLowerCase(arr[i])){
				lower++;
			}
			else{
				special++;
			}
		}
		System.out.println("The number of characters is as follows: ");
		System.out.println("lower case : "+lower);
		System.out.println("upper case : "+upper);
		System.out.println("numbers  : "+numbers);
		System.out.println("special characters : "+special);
	}
}