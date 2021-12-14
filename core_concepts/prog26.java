//overriding the toString method in java

import java.util.*;
import java.io.*;


class Student{
	private String name;
	private int rollno;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public void display(){
		//custome method to display the values;
		System.out.println("The values are : "+name+"  "+rollno);
	}
	public String toString(){
		//overriding the toString() method to make it customized;
		String temp=name+"  "+rollno;
		return temp;
	}
}
public class prog26{
	public static void main(String []args){
		Student std1=new Student("Aisvath",180701014);
		Student std2=new Student("Kumar",180701015);
		System.out.println(std1);
		System.out.println("--------------------");
		System.out.println(std2);

	}
}