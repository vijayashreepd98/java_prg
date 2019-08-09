import java.util.LinkedList;


public class linked_list {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList lst1=new LinkedList();//generic
lst1.addLast("web developer");
lst1.add(7);
lst1.addFirst('R');
lst1.add(true);
lst1.add(2,8.9);
lst1.set(1,"app developer");
System.out.println(lst1);
LinkedList<Double> lst2=new LinkedList<Double>();
lst2.addAll(lst1);
lst2.addFirst(45.4);
lst2.add(56.8);
System.out.println(lst1.get(3));
System.out.println(lst2.indexOf("app developer"));
lst2.remove();
lst2.removeFirst();
System.out.println(lst2);
	}

}
