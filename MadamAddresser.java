import java.util.Scanner;

public class MadamAddresser
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("What is your appropiate address");
		String lol = s.next();
		
		Factory factory = new UIFactory();
		Prefix madam = factory.getPrefix(lol);

		madam.printName();	
	}



}
