import java.util.Enumeration;
import java.util.Hashtable;


public class mine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<freelancer,String> prod=new Hashtable<freelancer,String>();
		freelancer a=new freelancer("razak","java",8,6889);
		freelancer b=new freelancer("ramya","c",4,6889);
		freelancer c=new freelancer("shree","python",9,68899);
		freelancer d=new freelancer("viji","c++",3,56889);
		prod.put(a,"IRTC");
		prod.put(b,"Axis");
		prod.put(c,"passportseva");
		prod.put(d,"IRTC");
		System.out.println(prod);
		
		Enumeration<freelancer> i=prod.keys();
		while(i.hasMoreElements())
		{
			freelancer y=i.nextElement();
			if(prod.get(y).equals("IRTC"))
			{
				System.out.println(y);
			}
		}
			}

}
