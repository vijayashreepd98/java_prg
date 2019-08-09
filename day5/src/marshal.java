import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class marshal {

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub
freelancer[] base=new freelancer[3];
base[0]=new freelancer("razak","java",7,788989);
base[1]=new freelancer("ramya","c",3,50000);
base[2]=new freelancer("riya","python",1,3000);
JAXBContext con=JAXBContext.newInstance(freelancer.class);
Marshaller marsh=con.createMarshaller();
marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
FileOutputStream fos=new FileOutputStream("C:/Users/LOGAN/Desktop/java_prg/marshal_ex.xml");
for(freelancer f:base)
{
	marsh.marshal(f,fos);
	
}
fos.close();

System.out.println("XML Created");


	}

}
