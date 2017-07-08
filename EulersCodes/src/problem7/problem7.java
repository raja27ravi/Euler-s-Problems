package problem7;

public class problem7 {
	//to find the nth prime number 
public static void main(String[]args)
{
	
	int primecount =0;
	long n=2;
	long nthprime = 10001;
	long num=0;
	while(primecount < nthprime)
	{
		long i=1;
		int count =0;
		//System.out.println("The value of n for calculating prime number is : " + n);
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
		
			 if (count > 2)
			{
				break;
			}
			i++;
			
		}
		if(count ==2)
		{
			primecount++;
			num = n;
			//System.out.println("The " + primecount + "th prime number is : " + num);
		}
		
		n++;
			}
	if(primecount == nthprime)
	{
		System.out.println("The " + primecount + "th prime number is : " + num);
	}

		
}
}
