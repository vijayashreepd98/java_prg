
public class thirdinside {
int suit=42;	 
public void root(long temp)
{
	long accno;
	accno=temp;
	
	
	class React
	{
		public void display()
		{
			System.out.println(thirdinside.this.suit);
		}
	}
	System.out.println(accno);
	React re=new React();
	re.display();
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
thirdinside th=new thirdinside();
th.root(15365635);

	}

}
