
import java.io.*;


public class DataIOTextFileDemoByFileInOutStream {        
    public static void main(String[] args) throws IOException {
        FileInputStream inObj = null;
        FileOutputStream outObj = null;
        try {
             inObj = new FileInputStream("hello.txt");
             outObj = new FileOutputStream("outHello.txt");
             int ch;
             while ((ch = inObj.read()) != -1) {
                outObj.write(ch);
             }
        } 
        finally {
            if (inObj != null) {
                inObj.close();
            }
            if (outObj != null) {
                outObj.close();
            }
        }
    }
}
