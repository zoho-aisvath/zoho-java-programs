//program to demonstrate difference between == and equals method

import java.util.*;
import java.io.*;

public class prog31{
	public static void main(String args[]){
		String s="aisvath";
		String s1="aisvath";
		String s2=new String("aisvath");
		System.out.println("Shallow comparison: ");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println("Deep comparison : ");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
	}
} 