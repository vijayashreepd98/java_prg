import java.util.*;
public class inter_thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
games game=new games();
shopping shop=new shopping(game);
Thread t1=new Thread(game,"viji");
Thread t2=new Thread(shop,"ram");
t1.start();
t2.start();
	}

}
class shopping implements Runnable
{
games g;
shopping(games temp)//constructor of shoping
{
	g=temp;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	synchronized(g.s)
	{
		if(g.amt<500)
		{
			g.amt=1000;
			System.out.println(Thread.currentThread().getName()+" going to notify ");
			g.s.notify();
		}
	}
	System.out.println(Thread.currentThread().getName()+" Shopping in levis and LeeCooper");
	}
	
}
class games implements Runnable
{
//int amount=300;
Scanner s=new Scanner(System.in);

int amt=s.nextInt();
	@Override
	public void run() {
		// TODO Auto-generated method st
		synchronized(s)
		{
			System.out.println("enter the price for entry ticket");
			amt=s.nextInt();
		if(amt<900)
		{
		try {
			
				s.wait();
				

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println(Thread.currentThread().getName()+"you can enjoy play station");
}
}
}
