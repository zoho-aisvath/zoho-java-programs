//program 7 to sort an array of characters
//this also implements basic bubble sort algorithm for simplicity
import java.util.*;
import java.io.*;
public class prog7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size of the array : ");
		int n=sc.nextInt();
		char arr[]=new char[n];
		System.out.println("Eneter the elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.next().charAt(0);	
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array is : ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
		}
	}
}