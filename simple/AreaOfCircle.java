import java.io.*;


public class AreaOfCircle
{
	public static void main(String [] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter the radious");
		float radious = Float.parseFloat(br.readLine());

		float area = 3.142f*radious*radious;

		System.out.println("area of a circle is " + area);
	}
}