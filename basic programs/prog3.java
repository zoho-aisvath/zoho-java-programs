//program 3 to print the fibonacci series
//printing the series until a certain  umber of elements have been printed. without using recursion
import java.util.*;
import java.io.*;
public class prog3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number of elements in the fibonacci series: ");
		int n=sc.nextInt();
		int first=0;
		int last=1;
		int temp=0;
		System.out.print("The Fibonacci series is  :0 1 ");
		//since the first 2 elements are 0 and 1 
		//assumption is that the number given as input is greater than 2
		for(int i=2;i<n;i++){
			temp=first+last;
			System.out.print(temp+" ");
			first=last;
			last=temp;
		}
	}
}