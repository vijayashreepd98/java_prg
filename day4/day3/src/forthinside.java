
public class forthinside {

	public static void main(String[] args)
	{
	new merchant().get(2);
	new merchant().gets();
	
	}
}
class merchant{
	int[] price={78,34,86,789,45};
	public void get(int index)
	{
		System.out.println(price[index]);
	}
	public void gets()
	{
		for(int i:price)
		{
			System.out.println(i);		}
	}
}
