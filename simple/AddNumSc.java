import java.util.*;



public class AddNumSc
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the num 1:");
		int a = sc.nextInt();

		System.out.print("enter the num 2:");
		int b = sc.nextInt();

		int ans = a + b;

		System.out.print("answer is :" + ans);
	}
}