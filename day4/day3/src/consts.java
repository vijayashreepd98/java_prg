
public class consts  extends briliant{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
consts con=new consts();
con.spring();
con.hibernate();

	}
	@Override
	public void  spring()
	{
		super.spring();
		
	}

}
class briliant
{
	public void spring()
	{
		System.out.println("basic web application");
	}
		final public void hibernate()
		{
			System.out.println("ORM module");
		}
	final private class android
	{
		//due to final it cannot extends also due to private it cannot instantiate
		public void skill()
		{
			System.out.println("java  and xml");
		}
	}
}
