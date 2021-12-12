//program 16 to split a praticular string using a delimiter
import java.util.*;
import java.io.*;
public class prog16{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.nextLine();
		System.out.println("Enter the delimiter : ");
		String s2=sc.nextLine();
		if(s1.contains(s2)){
			String arr[]=s1.split(s2);
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+",");
			}
		}
		else{
			System.out.println("Cannot split based on the given delimiter");
		}
	}
}