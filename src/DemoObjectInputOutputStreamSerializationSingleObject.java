
import java.io.*;


class SalePerson implements Serializable{
    String lastName;
    String firstName;
    double sal;
}
public class DemoObjectInputOutputStreamSerializationSingleObject {
    public static void main(String[] args) {
    FileInputStream fIn = null;
    FileOutputStream fOu = null;
    ObjectInputStream oIn = null;
    ObjectOutputStream oOu = null;
        try {
            String fileName = "SalePerson.bin";
            fOu = new FileOutputStream(fileName);
            oOu = new ObjectOutputStream(fOu);
            SalePerson e = new SalePerson();
            e.lastName = "Smith";
            e.firstName = "John";
            e.sal = 5000.00;
            oOu.writeObject(e);
            oOu.close();
            fOu.close();
            
            fIn = new FileInputStream(fileName);
            oIn = new ObjectInputStream(fIn);
            SalePerson emp = (SalePerson) oIn.readObject();
            System.out.println("First Name: " + emp.firstName);
            System.out.println("Last Name: " + emp.lastName);
            System.out.println("Salary: " + emp.sal);
            
            fIn.close();
            oIn.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
       
   }

}
