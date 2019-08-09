import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<product,String> prod=new Hashtable<product,String>();
		product a=new product(1,"samsung",6,700000);
		product b=new product(2,"dell",8,866000);
		product c=new product(7,"sony",90,7355000);
		product d=new product(5,"lenevo",54,877500);
		prod.put(a, "mobile");
		prod.put(b, "laptop");
		prod.put(d, "laptop");
		prod.put(c, "tv");
		System.out.println(prod);
	}
}


