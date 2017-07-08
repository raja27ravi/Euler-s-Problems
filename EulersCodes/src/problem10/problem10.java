package problem10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=2000000;
int count =0;
boolean flag=false;
long sum =0;
BigInteger bigInteger = new BigInteger("0");
List<Long> al = new ArrayList<Long>();
		for(long i =1;i<=num;i++)
		{
			count =0;
			flag = false;
			for(long j=1;j<=i;j++)
				{
				if(i>2 && i%2==0)
				{
					break;
				}
				
					if(i%j==0)
					{
						count++;
					}
					if(count>2)
					{
						break;
					}
				}
			if(count==2)
			{
				flag = true;
				al.add(i);
			}
		}
		for(int k=0;k<al.size();k++){
			sum = sum + al.get(k);
			//bigInteger.add(longValue(sum)); //sum= sum + al.get(k);
			//System.out.println("The sum of arraylist of primes : " + sum);
		}
		System.out.println("The sum of arraylist of primes : " + sum);
		
	}

}
