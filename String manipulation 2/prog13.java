//program 13 to eliminate a substring from a string
import java.util.*;
import java.io.*;
public class prog13{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.nextLine();
		System.out.println("Enter the substring: ");
		String s2=sc.nextLine();
		char arr[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arr2[0]){
				boolean check=true;
				int j=i;
				for(int k=0;k<arr2.length;k++){
					if(arr2[k]==arr[j]){
						j++;
					}
					else{	
						check=false;
						break;
					}
				}	
				if(check){
					i=i+arr2.length-1;
				}
				else{
					System.out.print(arr[i]);
				}
			}
			else{	
				System.out.print(arr[i]);
			}
		}		
	}
}
