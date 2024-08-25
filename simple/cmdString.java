import java.io.*;

public class cmdString{

	public static void main(String [] args)
	{
		if(args.length==0)
		{
			System.out.println("insufficent arguments sent !!!!!!!!!!!");
			System.exit(0);

		}

		for(int i=0;i<args.length;++i)
		{
			System.out.println(args[i]);
		}

		System.out.println("\nprinting the reverse arguments\n");

		for(int i = (args.length-1);i>=0;--i)
		{
			System.out.println(args[i]);
		}

	}

} 