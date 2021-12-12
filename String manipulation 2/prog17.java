//program 17 to tokenize a string with delimiter using StringTokenizer class
import java.util.*;
import java.io.*;
public class prog17{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s1," ");
		while(st.hasMoreTokens()){
			System.out.print(st.nextToken());
		}		
	}
}