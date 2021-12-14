import java.util.*;
import java.io.*;
public class protected_sample extends default_class{
	public static void main(String args[]){
		default_class s=new default_class();
		s.call();
		//trying to call protected method		
		s.method1();
	}
}