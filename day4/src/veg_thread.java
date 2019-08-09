
public class veg_thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
veg v=new veg();
nonveg nv=new nonveg();
Thread t1=new Thread(v,"vij");
Thread t2=new Thread(nv,"ram");
Thread t3=new Thread(v,"shree");
Thread t4=new Thread(v,"riya");
Thread t5=new Thread(nv,"raj");
Thread t6=new Thread(v,"shrija");
Thread t7=new Thread(nv,"radha");Thread t8=new Thread(v,"yash");
t1.start();t2.start();t3.start();
t4.start();t5.start();t6.start();t7.start();t8.start();

	}

}
class veg implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getName()+" had veg biriyani");
	System.out.println(Thread.currentThread().getName()+"had  curd rice");
	if(Thread.currentThread().getName().equals("shree"))
	{
		Thread.currentThread().stop();
	}
	System.out.println(Thread.currentThread().getName()+"had desrt");
	}
	

class nonveg  implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getName()+"had mutton biriyani");
	System.out.println(Thread.currentThread().getName()+"had fish");
	if(Thread.currentThread().getName().equals("radha"))
	{
		
			try {
				System.out.println(Thread.currentThread().getName()+"gonna wait");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	System.out.println(Thread.currentThread().getName()+"chicken");
	System.out.println(Thread.currentThread().getName()+"dessert");
	}
	
}
