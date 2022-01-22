import java.util.Scanner;

// This is a calculator app designed by Tarun due to covering of this shit.

class Test{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		// NOw lets calsulate will you!!

		int add  = a + b;
		int mul = a * b;
		int sub = a - b;
		int div = a / b;

		System.out.println("The Result of addition is: "+add);
		System.out.println("The Result of multiplication is: "+mul);
		System.out.println("The Result of subtraction is: "+sub);
		System.out.println("The Result of division is: "+div);

		// Now let's produce the addition, subtraction, multiplication, division of previous results.
		int sumt = 0;

		for(int i=0;i<5;i++)
		{
			sumt = sumt+add+mul;
		}
		System.out.println(sumt);


	}
}