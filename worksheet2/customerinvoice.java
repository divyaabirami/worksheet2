package worksheet2;

public class customerinvoice {
	public static void main(String arg[])
	{
	customer c1=new customer(1,"a1",20);
    System.out.println(c1.getid());
	System.out.println(c1.getname());
	System.out.println(c1.getdiscount());
	c1.setdiscount(30);
	System.out.println(c1.getdiscount());
	System.out.println(c1);
	
	System.out.println("------------------");
	
	
	customer c3=new customer(2,"a2",400);
	System.out.println(c3.getid());
	System.out.println(c3.getname());
	System.out.println(c3.getdiscount());
	System.out.println(c3.setdiscount(50));
	System.out.println(c3);
	
	System.out.println("------------------");
	
	
	
	invoice in =new invoice(100,c1,4000);
	customer c2=new customer(102,"b1",10);
	System.out.println(in.getdata());
	System.out.println(in.getcustomer());
	System.out.println(in.getamount());
	in.setamount(7000);
	in.setcustomer(c2);
	System.out.println("name of customer"+in.getcustomername());
	System.out.println("amount after discount"+in.getamountafterdiscount());
	
	System.out.println("------------------");
	
	
	invoice in1 =new invoice(200,c3,4000);
	customer c4=new customer(102,"a2",10);
	System.out.println(in1.getdata());
	System.out.println(in1.getcustomer());
	System.out.println(in1.getamount());
	in.setamount(3000);
	in.setcustomer(c4);
	System.out.println("name of customer"+in1.getcustomername());
	System.out.println("amount after discount"+in1.getamountafterdiscount());
	
	
	}
}
class customer
{
	int id;
	String name;
	int discount;
	customer(int i,String n,int d)
	{
	id=i;
	name=n;
	discount=d;
	}
	int getid()
	{
		return id;
		
	}
	String getname()
	{
		return name;
	}
	int getdiscount()
	{ 
		return discount;
	
	}
	int setdiscount(int dis)
	{
	discount=dis;
	return discount;
	}
	public String toString()
	{
		return"id"+id+"\n name"+name+"\n discount"+discount;
	}
}
class invoice
{
	int id;
	customer o;
	double amount;
	invoice(int i,customer o1,double a)
	{
		id=i;
		o=o1;
		amount=a;
	}
	int getid()
	{
	return id;
	}
	customer getcustomer()
	{
		return o;
	}
	

	void setcustomer(customer o2)
	{
		o=o2;
	}
	int getdata()
	{
		return id;
	}
	double getamount()
	{
		return amount;
	}
	void  setamount(double am)
	{
		 amount=am;
	}
	String getcustomername()
	{
		return o.name;
	}
	double getamountafterdiscount()
	{
		return (amount-((amount)*o.discount/100));
	}
}	
		
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	