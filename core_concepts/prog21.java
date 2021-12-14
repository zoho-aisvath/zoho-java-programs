//all object references in java are passed by value , a copy of the object is passed on to the method 

//java supports pass by value
// value of the function parameters is copied into another location of memory



public class prog21{
	int value;
	public String name="Aisvath";
	public static void main(String srgs[]){
		int x=3;
		change(x);
		System.out.println("value of x is : "+x);
		prog21 obj=new prog21();
		obj.name="Aisvath";
		change_reference(obj);
		System.out.println(obj.name);
		
	}
	public static void change(int x){
		x=300;
	}
	public static void change_reference(prog21 obj){
		obj.name="Kumar";
	}
}
