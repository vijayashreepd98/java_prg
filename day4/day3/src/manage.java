
public class manage  implements operate{

	/**
	 * @param args
	 */
	
	freelancer[] base=new freelancer[5];
	static int pos;
	public static void main(String[] args) {
		// TODO Auto-generated method st
		freelanfer f=new freelancer("Razak","JAva",7,1999);
		freelancer b=new freelancer("Bhhaskar","Python",3,19999);
		freelancer t=new freelancer("Titus","C",12,6000);
		freelancer m=new freelancer("Murali","java",2,6000);
		manage man=new manage();
		man.insert(f);
		man.insert(b);
		man.insert(t);
		man.insert(m);
		pos=0;
		man.search("java");
	}
}
	@Override
	public void insert(freelancer free)
	{
	for(int index=0;index<base.length;index++)
	{
		if(base[index]==null)
		{
			base[index]=free;
			System.out.println(free.getName()+"lancer added");
			break;
			
		}
	}
	@Override
	public void search(String tech)
	{
		``````````````````````if(pos>=base.length)
		return ;
	else
	{
		if(base[pos].getSkill().equalsIgnoreCase(tech))
		{
			System.out.println(base[pos]);
			pos++;
		}
	}
	search(tech);
	}
		
	
	}













































































































































































































































































	}

}
