import java.util.Iterator;
import java.util.Stack;


public class teststack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack stk1=new Stack();//generic
stk1.push(22);
stk1.push("hgsj");
stk1.push(5.6F);
stk1.push(4766889990L);
stk1.push('R');
System.out.println(stk1.search('r'));
System.out.println(20);
Stack<String> stk2=new Stack<String>();//non-generic
stk2.addAll(stk1);
System.out.println(stk2);
stk1.pop();
System.out.println(stk2.search(5.6));
System.out.println(stk1.peek());
Iterator<Object> i=stk1.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
stk1.clear();
System.out.println(stk1);


	}

}
