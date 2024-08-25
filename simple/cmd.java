import java.util.Arrays;

import java.io.*;

public class cmd{

public static void main(String  args[]) 
{
	if(args.length == 0)
	{
		System.out.println("insufficen argument");
		System.exit(0);
	}
	System.out.println(Arrays.toString(args));
	System.out.printf(args);

}


}



