//performing read and write operations ona file 

import java.util.*;
import java.io.*;

public class prog39{
	public static void main(String args[]){
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\AISVATH\\Desktop\\zoho\\collections\\op.txt"));
			bw.write("Aisvath\n");
			bw.write("Kumar\n");
			bw.write("This is a sample text file created ! \n");
			bw.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
		System.out.println("Reading from the file : ");
		try{
			BufferedReader b=new BufferedReader(new FileReader("C:\\Users\\AISVATH\\Desktop\\zoho\\collections\\op.txt"));
			String s;
			while((s=b.readLine())!=null){
				System.out.println(s);
			}
			b.close();
		}
		catch(IOException e){	
			System.out.println(e);	
		}
		
		
	}
}