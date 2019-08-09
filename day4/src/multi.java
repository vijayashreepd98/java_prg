import java.util.InputMismatchException;
import java.util.Scanner;


public class multi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("viji emploment service");
String name=null;
int exp[]={12,4,2,8,5};
int index=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
name=s.next();
try
{
	System.out.println("Meniton experience by index");
	index=s.nextInt();
	System.out.println("Selected exp:"+exp[index]);
}
catch(ArrayIndexOutOfBoundsException a)
{
	System.out.println(a+" please enter a index within range"+exp.length);
	index=s.nextInt();
	System.out.println("Selected exp:"+exp[index]);
}
catch(InputMismatchException m)
{
	Scanner b=new Scanner(System.in);
	System.out.println(m+" \n Ener only numbers within range "+exp.length);
	index=s.nextInt();
	System.out.println("Selected exp:"+exp[index]);
}
finally
{
	if(exp[index]>2&&exp[index]<6)
	{
		System.out.println(name+"will get 15.8LPA");
		
	}
	else if(exp[index]<=6&&exp[index]<8)
		System.out.println(name+" will get 20LPA");
	else if(exp[index]>=8)
		System.out.println(name+"will get 25LPA");
	else
		System.out.println(name+"will get 3..5LPA");
}
	}

}
