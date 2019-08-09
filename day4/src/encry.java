import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;


public class encry   {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
freelancer  base=new  freelancer("razak","java",7,189889);
File file=new File("C:/Users/LOGAN/Desktop/java_prg/example.doc/");
FileOutputStream fos=new FileOutputStream(file);
DeflaterOutputStream dos=new DeflaterOutputStream(fos);
dos.write(base.toString().getBytes());
dos.close();
fos.close();
System.out.println("File Createtd  and data written");
//file  reading
FileInputStream fis=new FileInputStream(file);
InflaterInputStream iis=new InflaterInputStream(fis);
byte[] temp=new byte[fis.available()];//availabel>>file content size
iis.read(temp);
iis.close();
fis.close();
System.out.println(new String(temp));


	}

}
