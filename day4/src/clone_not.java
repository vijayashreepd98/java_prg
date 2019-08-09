
public class clone_not implements Cloneabel  {
String bike;
	/**
	 * @param args
	 */
	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
clone_not c1=new clone_not();c1.bike="Avengers220";
clone_not c2=new clone_not();c2.bike="Apache220";
System.out.println(c1.bike+" "+c2.bike);
clone_not c3=new clone_not();
c3=c2;
System.out.println(c2.bike+" "+c3.bike);
c3.bike="R15";
System.out.println(c3.bike+" "+c2.bike);
clone_not c4=(clone_not) c1.clone();
System.out.println(c4.bike+" "+c1.bike);
c1.bike="Mahindra Jawa";
System.out.println(c4.bike+" "+c1.bike);


	}
}
