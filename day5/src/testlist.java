import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;


public class testlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>mi=new ArrayList<Integer>();
Vector<Integer> nokia=new Vector<Integer>();
mi.add(7800);
mi.add(124000);
mi.add(16200);
mi.add(9600);
nokia.add(16788);
nokia.add(9600);
nokia.add(56787);
nokia.addAll(mi);
System.out.println(mi.contains(123899));
nokia.set(3,141000);
mi.remove(3);
System.out.println(mi);
System.out.println(nokia);
mi.removeAll(nokia);
System.out.println(mi);
nokia.add(9800);
Collections.replaceAll(nokia,9800,7800);
Collections.sort(nokia);
System.out.println(nokia);
nokia.retainAll(mi);
System.out.println(nokia);
	}

}
