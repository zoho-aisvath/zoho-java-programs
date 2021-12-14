//Private constructors usage 
//by using private constructors , we cannot instantiate it 

class sample1{	
	private static sample1 obj;
	private sample1(){
		
	}
	public static sample1 getobj(){
		if(obj==null){
			obj=new sample1();
			System.out.println("Reached here ");
		}
		return obj;
	}
}	


public class prog25{
	public static void main(String args[]){
		//sample1 A=new sample1();		 if executed, will lead to compile time error

		sample1 obj1=sample1.getobj();	// retuirning the reference of thatstatic variable in the class
		sample1 obj2=sample1.getobj();	// same reference will be stored in another variable 

		//both obj1 and obj2 point to the same reference i.e static instance of the class 
		System.out.println(obj1+"  "+obj2);
	}
}