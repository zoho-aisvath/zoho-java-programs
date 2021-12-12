//program 1 to find out factorial of n numbers.(n numbers taken as an array) and fact of each number
//factorial calcukated in a seperate function using recursion
import java.util.*;
import java.io.*;
public class prog4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size of the array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Eneter the elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<n;i++){
			System.out.println("factorial of "+arr[i]+" is "+factorial(arr[i]));
		}	
	}
	public static int factorial(int n){
		if(n==1){
			return n;
		}
		else{
			return n*factorial(n-1);
		}
	}
}