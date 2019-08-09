import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class serial {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException ,ClassNotFoundException {
		// TODO Auto-generated method stub
freelancer base=new freelancer("mahashwara","java",8,266878);
File file=new File("C:/Users/LOGAN/Desktop/java_prg/ser1.doc/");
//Serialization
FileOutputStream fos=new FileOutputStream(file);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(base);
oos.close();
fos.close();
System.out.println("Objct written");
//Deserialization
FileInputStream fis=new FileInputStream(file);
ObjectInputStream ois=new ObjectInputStream(fis);
freelancer temp=(freelancer)ois.readObject();
ois.close();
fis.close();
System.out.println(temp);

	}

}
