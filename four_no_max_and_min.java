package daily_qus;

public class four_no_max_and_min {
	public static void main(String[]args)
	{
	int a=120,c=200,b=560,d=500;
	int max=0;
	int min=0;
	if(a>=max)
	{
		max=a;
	}
	else 
	{
		if(min<=a)
		min=a;
	}
	if(b>=max)
	{
		max=b;
	}
	else 
	{
		if(min<=b)
		min=b;
	}
	
	if(c>=max)
	{
		max=c;
	}
	else 
	{
		if(min<=c)
		min=c;
	}
	if(d>=max)
	{
		max=d;
	}
	else 
	{
		if(min<=d)
		min=d;
	}
	System.out.println("max no is -"+max);
	System.out.println("min no is -"+min);
	
	}
}
