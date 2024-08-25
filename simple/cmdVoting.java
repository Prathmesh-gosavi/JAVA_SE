import java.io.*;

public class cmdVoting{

	public static void main(String [] args)
	{
		if(args.length==0)
		{
			System.out.println("insufficent argumen !!!!!!!!!!!");
			System.exit(0);
		}
		int cnt=0;
		for(int i=0;i<args.length;i++)
		{
			int nums=Integer.parseInt(args[i]);

			if(nums >=18)
			{
				cnt++;
			}
		}
		System.out.println("elegible for voting is "+ cnt);
	}
}