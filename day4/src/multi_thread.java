import java.util.*;
public class multi_thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		machine m=new machine();
		//m.getmoney();
Thread t1=new Thread(m,"viji");
Thread t2=new Thread(m,"ram");
Thread t3=new Thread(m,"shree");
Thread t4=new Thread(m,"riya");
t1.start();t2.start();t3.start();t4.start();

		
	}

}
class machine extends Thread
{
	int available=12000;
	Scanner s=new Scanner(System.in);
	public void getmoney()
	{
	System.out.println("enter amount");
	int amount=s.nextInt();
	if(amount<=available)
	{
		System.out.println("you can withdraw");
		
	}
	
	else
		System.out.println("you cannot withdraw");
	
}
	synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getId()+"  "+Thread.currentThread().getPriority());
		getmoney();
	}
}
