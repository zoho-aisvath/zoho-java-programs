//program 1 to find out the greatest element in the array.
//array of integers has been obtained as an input from the user.
import java.util.*;
import java.io.*;
public class prog1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size of the array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Eneter the elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();	
		}
		//int arr[]={25,32,18,6,47,54,98,121,108,76}; in case you want to skip the input obtaining part
		int temp=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>temp){
				temp=arr[i];
			}
		} 
		System.out.println("Greatest element in the array is  "+temp);
	}
}