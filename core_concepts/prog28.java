//use of static methods in programs

import java.util.*;
import java.io.*;

class employee{
	private int empid;
	private String emp_name;	
	static int count_of_emp=0;	
	employee(int empid,String emp_name){
		this.empid=empid;
		this.emp_name=emp_name;
		count_of_emp++;
	}
	public static int get_count(){
		return count_of_emp;
	}
	
}

public class prog28{
	public static void main(String args[]){
		employee emp1=new employee(180701014,"Aisvath");
		employee emp2=new employee(180701015,"Adhi");
		employee emp3=new employee(180701016,"Anuraag");
		employee emp4=new employee(180701017,"Akhil");
		employee emp5=new employee(180701018,"Vijay");
		System.out.println("The number of employees created are : "+employee.get_count());		
	}
}