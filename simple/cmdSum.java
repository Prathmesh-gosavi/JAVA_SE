import  java.io.*;


public class cmdSum {

	public static void main(String [] args)
	{
		if(args.length==0)
		{
			System.out.println("insufficient aruments sentsss !!!!!!!!!!!!");
			System.exit(0);
		}
		int sum=0;
		for(int i=0;i<args.length;++i)
		{
			int num=Integer.parseInt(args[i]);

			sum=sum+num;
		}

		System.out.println("the sum is "+ sum);
		System.out.printf("the sum is %d \n",sum);


	}
}