import java.util.*;
public class purpose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String yet="123455667689";
try
{
	System.out.println(yet.charAt(new Random().nextInt()));
	System.out.println("random generated");
}
catch(StringIndexOutOfBoundsException obj)
{
	System.out.println(obj+"\n range should be within "+yet.length());
	System.out.println(yet.charAt(new Random().nextInt(yet.length())));
	System.out.println("Random generated");
}
finally{
	System.out.println("work is done");
}
	}

}
