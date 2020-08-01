package worksheet2;


import java.util.Scanner;

public class studentdetails {

	public static void main(String args[]) 
	{
	stduent obj[]=new stduent[10];
	for(int i=0;i<2;i++)
	{
		obj[i]=new stduent();             
		obj[i].getdata();                   
	    obj[i].markcacl();                 
	    obj[i].display();                    
				
		                    
	}
		
		// TODO Auto-generated method stub

	}

}
class stduent
{
	String name,dept,status;
	double m1,m2,m3,avg;
	void getdata()
	{
		Scanner obj=new Scanner(System.in);
		name=obj.next();
		dept=obj.next();
		//status=obj.next();
		m1=obj.nextDouble();
		m2=obj.nextDouble();
		m3=obj.nextDouble();
	
	}
	void markcacl()
	{
		avg=(m1+m2+m3)/3;
		if(m1<50 || m2<50 ||m3<50)
		{
			status="fail";
		}
		else
		{
			if(avg>=80)
				status="1st class";
			else if(avg>=70 && avg<=79)
				status="2nd class";
			else if(avg>=50 && avg<=69)
					status="3rd class";
		}
	}
	
	void display()
	{
		System.out.println("name:"+name+"\ndept:"+dept+"\nmark m1:"+m1+"\n m2:"+m2+"\n m3:"+m3+"\n aver:"+avg+"\n status"+status);
	}
	}
	
