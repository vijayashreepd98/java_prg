import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



public class unmarshal {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException,UnmarshalerException {
		// TODO Auto-generated method stub
File file =new File("C:/Users/LOGAN/Desktop/java_prg/marshal_ex.xml/");
JAXBContext con=JAXBContext.newInstance(freelancer.class);
Unmarshaller unmarsh=con.createUnmarshaller();
freelancer temp=(freelancer)unmarsh.unmarshal(file);
System.out.println(temp);
	}

}
