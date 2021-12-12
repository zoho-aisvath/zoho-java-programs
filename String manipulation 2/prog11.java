//program 11 to get number of occurences of a substring
import java.util.*;
import java.io.*;
public class prog11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.nextLine();
		System.out.println("Enter the substring :");
		String s2=sc.nextLine();
		char arr[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arr2[0]){
				boolean check=true;
				int j=i;
				for(int k=0;k<arr2.length;k++){
					if(arr[j]==arr2[k]){
						j++;
					}
					else{	
						check=false;
						break;
					}
				}
				if(check){	
					count++;
				}
			}
		}
		System.out.println("The number of occurences of substring "+s2+" in "+s1+" is "+count);
	}
}