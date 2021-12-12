import java.util.*;
import java.io.*;
public class prog19{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//differences between string and stringbuilder
		String s1="Aisvath";
		String s2="Kumar";
		String c="sample";
		String d="appended";
		StringBuilder sb1=new StringBuilder(s1);
		StringBuilder sb2=new StringBuilder(s2);
		System.out.println("Supplied strings s1= "+s1+" s2= "+s2+"\n");
		System.out.println("Strings are immutable: ");
		//concat operation
		System.out.println("1. concat operation ");
		System.out.println("String s1 before concatenating is "+s1);
		s1.concat(s2);
		System.out.println("the concat function will not change the data ");
		System.out.println("String s1 after concatenating s2 will be = "+s1);
		System.out.println("\n");
		System.out.println("2. replace operation:  ");
		System.out.println("while carrying out : "+s1.replace("Ais","XYZ"));
		System.out.println("s1 after replacing ,s1 will still be "+s1);
		System.out.println("\n");
		System.out.println("Stringbuilder is mutable ");
		System.out.println("1. Append operation");
		System.out.println("String builder before concatenating ="+sb1);
		sb1.append(s2);
		System.out.println("Stringbuilder after concatenating is= "+sb1);
		System.out.println("\n");
		System.out.println("2. Replace operations");
		sb1.replace(0,3,"XYZ");
		System.out.println("Sb1 after replacing is : "+sb1);
	}
}