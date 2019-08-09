import java.util.HashSet;
import java.util.TreeSet;


public class hash_tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Character> set1=new HashSet<Character>();
set1.add('R');
set1.add('M');
set1.add('s');
set1.add('a');
set1.add('i');
set1.add('q');
set1.add('m');
System.out.println(set1);
TreeSet<Character> set2=new TreeSet<Character>();
set2.addAll(set1);
System.out.println(set2);
set1.remove('R');
set2.add('a');
System.out.println(set2);
System.out.println(set2.contains('R'));
TreeSet<freelancer> obj=new TreeSet<freelancer>();
obj.add(new freelancer("razak","java",3,8798898));
obj.add(new freelancer("ram","python",7,679890));
obj.add(new freelancer("shree","c",9,6572798));
obj.add(new freelancer("viji","c++",7,56789));
System.out.println(obj);}

}
