package problem11;

public class problem11 {
//calculate a sum of the numbers and then calculate the numbers of divisoors, if it exceeeds 500 stop the 
	//while loop
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int count =0;
		int countmax=0;
		long sumofnumbm=0;	
		long num =1;
		long nofofdivis=500;
			while(count<nofofdivis)
			{
				count=0;
				sumofnumbm = traingleNUmber(num);
				
				for(long i=1;i<=sumofnumbm;i++)
				{
					if(sumofnumbm%i==0)
					{
						count++;
					}
				}
				if(count>300){

					System.out.println(" for trinagle number : " + sumofnumbm + " Number of divisors " + count );
				}num++;
			}
		
			
			}
public static long traingleNUmber(long num)
{
	long sum=0;
	for(long i =0;i <=num;i++)
	{
		sum = sum +i;
	}
return sum;	
}
}
