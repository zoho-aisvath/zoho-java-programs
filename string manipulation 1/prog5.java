//program 5 to check if the given string is palindrome or not
//by converting the string to a character array(since I was not asked to use inbuilt methods)
import java.util.*;
import java.io.*;
public class prog5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be checked : ");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int n=arr.length;
		char arr_rev[]=new char[n];
		int j=0;
		for(int i=n-1;i>=0;i--){
			arr_rev[j++]=arr[i];
		}
		boolean palindrome=true;
		for(int i=0;i<n;i++){
			if(arr[i]==arr_rev[i]){
				palindrome=true;
			}
			else{
				palindrome=false;
				break;
			}
		}
		if(palindrome){
			System.out.println("The entered string is a palindrome");
		}
		else{
			System.out.println("The enetered string is not a palindrome ! sorry !");
		}
	}
}
