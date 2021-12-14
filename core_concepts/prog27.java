//private and protected classes in java

class outer_class{
	private String name;
	private int rollno;
	outer_class(){
		name="Aisvath";
		rollno=14;
	}
	class inner_class1{
		public void display_1(){
			System.out.println("Inner class 1's display method is called");
			System.out.println(name+"  "+rollno);
		}	
	}
	private class inner_class2{
		public void display_2(){	
			System.out.println("Inner class 2's display method is called");
			System.out.println(name+"    "+rollno);
		}
	}
	protected class inner_class3{
		public void display_3(){	
			System.out.println("Inner class 3's display method is called");
			System.out.println(name+"      "+rollno);
		}
	}
	public void call_inner(){
		inner_class2 obj=new inner_class2();
		obj.display_2();
	}
	
}
public class prog27{
	public static void main(String args[]){
		outer_class a=new outer_class();
		//outer_class.inner_class2 ob=a.new inner_class2();     won't work due to private access modifier
		//ob.display_2();
		a.call_inner();

		//to call public inner class's method,
		System.out.println("----------");
		outer_class o=new outer_class();
		
		outer_class.inner_class1 objec=o.new inner_class1();
		objec.display_1();
		System.out.println("----------");
		outer_class.inner_class3 objec1=o.new inner_class3();
		objec1.display_3();
	}
}