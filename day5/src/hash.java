import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;


public class hash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<String,Integer> can=new Hashtable<String,Integer>();
can.put("shree",4);
can.put("riya",1);
can.put("radhika",0);
can.put("ram",2);;
can.put("shrija",1);
System.out.println(can);
TreeMap<String,Integer> pro=new TreeMap<String,Integer>();
pro.putAll(can);
System.out.println(pro);
pro.remove("riya");
System.out.println(pro.containsValue(3));
System.out.println(can.containsKey("riya"));
Set<String> names=pro.keySet();
	System.out.println(names);
Collection<Integer> count=can.values();
System.out.println(count);
	}

}
