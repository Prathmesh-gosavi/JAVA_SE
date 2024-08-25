
import java.io.*;

public class cmdMax{

	public static void main(String [] args)
	{
		int max=0;
		if(args.length==0)
		{
			System.out.println("no argument sent!!!!!!!!!!!!!!!");
			System.exit(0);
		}


		for(int i=0; i<args.length;i++)
		{	
			int num = Integer.parseInt(args[i]);

			if(num > max)
			{
				max=num;
			}
		}

		System.out.printf("max is "+max);
	}

}