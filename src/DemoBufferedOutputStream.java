
import java.io.*;


public class DemoBufferedOutputStream {
     public static void main(String[] args) {       
       String filename = "output.txt";
       String output = "Di Di day neee";    
       BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        try {        
           // create FileOutputStream from filename
            fos = new FileOutputStream(filename); 
           // create BufferedOutputStream for FileOutputStream
            bos = new BufferedOutputStream(fos);
            bos.write(output.getBytes());          
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File not found" + fnfe);
        }
        catch (IOException ioe) {
            System.out.println("Error while writing to file" + ioe);
        }
        finally {
            try {
                if (bos != null) {
                    bos.flush();
                    bos.close();
                }
            }
            catch (Exception e) {
                System.out.println("Error while closing streams" + e);
            }
        }
    }   
}
