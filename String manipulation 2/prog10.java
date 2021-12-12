//program 10 to compare two strings with/out case
import java.util.*;
import java.io.*;
public class prog10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.nextLine();
		System.out.println("Enter string 2 : ");
		String s2=sc.nextLine();
		boolean ex=true;
		do{
			System.out.println("1. with case  2.without case  3.exit");
			int ch=sc.nextInt();
			switch(ch){
				case 1:
					if(s1.equals(s2)){
						System.out.println("The two strings are equal");
					}
					else{
						System.out.println("The two strings are not equal");
					}
					break;
				case 2:
					if(s1.equalsIgnoreCase(s2)){
						System.out.println("The 2 strings are equal");
					}
					else{
						System.out.println("Not equal ");
					}
					break;
				case 3:
					ex=false;
					break;
				default:
					System.out.println("Enter valid input ");
					break;
					 
			}
		}while(ex);
	}
}
