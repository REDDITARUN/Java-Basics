import java.util.Scanner;

class Sineseries
{
    public static void main(String[] args) {

        int i=1, n;
        double x,x1,t,sum; 
        
        Scanner in = new Scanner(System.in);
        
        //Convert the value to radian x = x * 3.14159 / 180

        System.out.println("Enter the value for x : ");
        x = in.nextDouble();

        System.out.println("Enter the value for n : ");
        n = in.nextInt();

        x1=x*3.14159/180;

        t=x1; sum=x1;

        //for(i=1;i<=n;i++)
        while (i<=n)
        {
            t=t*(-1)*x1*x1/(2*i*(2*i+1));
            sum=sum+t;
            i++;
        }

        System.out.println("The sine value for:" + x + "\t"+"is" + "\t"+ sum);
    }
}