import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;


public class string_list {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> st=new ArrayList<String>();
Vector<String> st1=new Vector<String>();
st.add("hello");
st.add("how");
System.out.println(st);

st.set(0,"hey");
st.add("how");
System.out.println(st);
		
st1.addAll(st);
System.out.println(st1);
st.remove("hey");
System.out.println(st);

Collections.sort(st);
System.out.println(st);
System.out.println(st1);
}

}
