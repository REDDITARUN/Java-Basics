package practicecat2;
import java.util.Scanner;
public class taru 
{
public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x,y,i;
		i=0;
		System.out.println("Enter the value of x coordinate =");
		x=sc.nextInt();
	    System.out.println("Enter the value of y coordinate =");
		y=sc.nextInt();
		if(x==i&&y==i)
		{
		    System.out.println("Is the origin");
		}
		if(i<x)
		{
		    if(y==0)
		    System.out.println("Is on x-axis");
		    
		}
		if(i>x)
		{
			if(y==0)
				System.out.println("Is on x-axis");
		}
		if(i<y)
		{
			if(x==0)
				System.out.println("Is on y-axis");
		}
		if(i>y)
		{
			if(x==0)
			System.out.println("Is on y-axis");
		}
		if(i<x)
		{
			if(i<y)
				System.out.println("In Quad 1");
		}
		if(i>x)
		{
			if(i<y)
				System.out.println("In Quad 2");
		}
		if(i>x)
		{
			if(i>y)
				System.out.println("In Quad 3");
		}
		if(i<x
				) {
			if(i>y)
				System.out.println("In Quad 4");
		}
			
	}
}
