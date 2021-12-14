//custome exception 

import java.util.*;
import java.io.*;

class AisvathException extends Exception{
	public AisvathException(String errorMessage){
		super(errorMessage);
	}
}

public class prog33{
	public static void main(String args[]){
		try{
			throw new AisvathException("Aisvath's error encountered !");
		}
		catch(AisvathException e){
			System.out.println(e);
		}
		System.out.println("Handled and proceeded");
	}
}
