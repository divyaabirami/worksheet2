package worksheet2;

import java.util.Scanner;

public class arithmetic {

	public static void main(String aa[]) {
		// TODO Auto-generated constructor stub
Scanner obj=new Scanner(System.in);
arith d=new arith();
System.out.println("\n enter first number");
int a=obj.nextInt();
System.out.println("\n enter second number");
int b=obj.nextInt();
System.out.println("\n add="+d.add(a,b));
System.out.println("\n sub="+d.sub(a,b));
System.out.println("\n mul="+d.mul(a,b));
System.out.println("\n divi="+d.div(a,b));
	}

}
class arith
{
	int a;
	int b;
	int c;
	int add(int a,int b)
	{
		c=a+b;
		return(c);
	}
	int sub(int a,int b)
	{
		c=a-b;
		return(c);
	}
	int mul(int a,int b)
	{
		c=a*b;
		return(c);
	}
	int div(int a,int b)
	{
		c=a/b;
		return(c);
	}
}