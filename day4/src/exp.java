
public class exp extends seek{
@Override
public void graduate() throws CloneNotSupportedException, ArithmeticException
{
	super.graduate();
}
	/*
	 * @param args
	 */
	public static void main(String[] args)throws ClassNotFoundException,CloneNotSupportedException {
		// TODO Auto-generated method stub
		exp sk=new  exp();
		sk.geek();
		sk.professional();
		sk.graduate();
	}

}

class seek
{
	public void geek()throws ClassNotFoundException
	{
		System.out.println("Geeks doing inventions");
		}
	public void professional()throws IndexOutOfBoundsException,NullPointerException
	{
		System.out.println("Proffessional buliding product");
		
	}
	public void graduate() throws CloneNotSupportedException
	{
		System.out.println("SSimply listen");
	}
}