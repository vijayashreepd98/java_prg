import java.util.Scanner;


public class users {

	static freelancer[] base=new freelancer[3];
	static boolean status=false;
	
			/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
base[0]=new freelancer("razak","java",7,67008);
base[1]=new freelancer("ram","c++",6,84889);
base[2]=new freelancer("shree","python",3,95085);
filter("datastructures");

}
	public static void filter(String some)
	{
			for(freelancer free:base)
			{
				if(free.getSkill().equals(some))
				{
					System.out.println(free);
					status=true;
				}
				else
				{
					status=false;
				}
			}
			if(status)
			{
				return;
			}
			else
			{
				try
				{
					throw new myexception(some);
				}
				catch(myexception me)
				{
					System.out.println(me+"\nEnter another skill");
					filter(new Scanner(System.in).next());
				}
				}
			}
	}
