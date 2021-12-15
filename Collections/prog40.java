//we import java.i=time package to work with date and time API


import java.time.*;
import java.time.format.DateTimeFormatter;

public class prog40{
	public static void main(String args[]){
		System.out.println("To print the current date : ");
		LocalDate Obj = LocalDate.now();		//Date object created
    		System.out.println(Obj);
		System.out.println("------------------------");

		System.out.println("To print the current time : ");
		LocalTime Obj1 = LocalTime.now();
    		System.out.println(Obj1);
		System.out.println("------------------------");

		System.out.println("To display both date and time : ");
		LocalDateTime Obj2 = LocalDateTime.now();
    		System.out.println(Obj2);
		System.out.println("------------------------");

		LocalDateTime Obj4 = LocalDateTime.now();
    		System.out.println("Before formatting: " + Obj4);
		DateTimeFormatter fObj = DateTimeFormatter.ofPattern("dd-MM-yyyy     HH:mm:ss");

		String formattedDate = Obj4.format(fObj);
    		System.out.println("After formatting: " + formattedDate);
		
	}
}