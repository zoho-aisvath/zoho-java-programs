//access modifiers in java 
//for classes - top level class can either be public or default 
//private classes will be allowed only for nested/inner classes.

//priavte - only within the class 
//default- only within the package
//protected - within the package and for outside the package using inheritance
//public - everywhere

import java.util.*;
import java.util.*;


class default_class{
	public String name;
	public int r_no;
	private int id;
	protected int random;
	default_class(){
		name="Aisvath";
		r_no=14;
		id=180701014;
		random=0;
	}
	public void display(){
		System.out.println("Public class: ");
		System.out.println("Name= "+name);
		System.out.println("Roll No= "+r_no);
		System.out.println("id= "+id);
	}
	private void printof(){
		System.out.println("--------");
		System.out.println("Private method called through a public method");	
		System.out.println("--------");
	}
	public void call(){
		printof();
	}
	protected void method1(){
		System.out.println("Protected methoid is called");
	}

}

public class prog22{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		default_class s=new default_class();
		s.display();
		System.out.println("-----------");
		System.out.println("Trying to access private method of the above class will lead to error");
		s.call();
		s.method1();
		System.out.println("-----------");
		System.out.println("Trying to access the public variables : ");
		System.out.println(s.name+" "+s.r_no);
		System.out.println("Cannot access private data member");
		System.out.println(s.random);
	}
}
