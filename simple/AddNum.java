import java.io.*;

public class AddNum {

	public static void main(String[] args) throws Exception 
	{

		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter the frist number :");
		int a = Integer.parseInt(br.readLine());

		System.out.print("enter the secound number");
		int b = Integer.parseInt(br.readLine());

		int c=a+b;

		System.out.println("answer is :"+ c);

	}
}