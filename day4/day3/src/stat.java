
public class stat {
String org;
double pack;
static int count;
public String toString()
{
return org+""+pack+""+count+"\n";	
}
static class Mango
{
	String tech;
	public void detail()
	{
		System.out.println(tech);
	}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
stat first=new stat();
first.org="Infosys";
first.count=56;
first.pack=8.9;
stat second=new stat();
second.org="TCS";
second.pack=6.3;
second.count=89;
System.out.println(first+""+second);
stat.Mango man=new stat.Mango();
man.tech="hello";
man.detail();

;
}

}
