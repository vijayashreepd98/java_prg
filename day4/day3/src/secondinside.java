
public class secondinside {
String product;
float monitorsize;
class Enquiry
{
	int price;
	public void show()
	{
		System.out.println(product+""+monitorsize+""+price);
		
	}
	public  void greetings()
	{
		System.out.println(product+"are going to dispay");
		
	}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
secondinside pin=new secondinside();
pin.product="hello";
pin.monitorsize=45;
Enquiry en=pin.new Enquiry();
en.price=6700;
en.show();
en.greetings();

	}

}
