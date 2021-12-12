//prog20 to demonstrate speed differences in string and stringbuilder
public class prog20{
	 public static String String_concat(){  
        	String s1 = "Aisvath";  
	        for (int i=0; i<10000; i++){  
	            s1 = s1 + " kumar";  
        	}  
	        return s1;  
	 }  
    	public static String StringBuffer_concat(){  
        	StringBuffer sb = new StringBuffer("Raffish");  
	        for (int i=0; i<10000; i++){  
	            sb.append(" kumar");  
        	}  
	        return sb.toString();  
	}  
	public static void main(String args[]){
		long startTime = System.currentTimeMillis(); //returns current time in ms 
        	String_concat();  
        	System.out.println("Time taken by Concatenating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        	startTime = System.currentTimeMillis();  
        	StringBuffer_concat();  
       		System.out.println("Time taken by Concatenating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
		System.out.println("This proves that StringBuffer is faster than string in processing speed");  
		
	}
}