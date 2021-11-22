
import java.io.*;


public class DemoByteArrayInputStreamClass {
    public static void main(String args[]) throws IOException { 
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
        // Gets the inputs from the user : 3 characters
        while( bOutput.size()!= 3 ) {
          bOutput.write(System.in.read()); 
        }
        System.out.println("Print data:");  
        byte b[] = bOutput.toByteArray(); 
        ByteArrayInputStream in = new ByteArrayInputStream(b); 
        int c ;
        while ((c = in.read()) != -1) {                
                   System.out.print(Character.toUpperCase((char) c)); 
         }             
        System.out.println();   
        }           
 } 
     

