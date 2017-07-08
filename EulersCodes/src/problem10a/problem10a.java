package problem10a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class problem10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=2000000;
int count =0;
boolean flag=false;
long sum =0;
BigInteger bigInteger = new BigInteger("0");
List<Long> al = new ArrayList<Long>();
		for(long i =2;i<=num;i++)
		{
			count = 0;
			
			
			for(long j =1;j<=i;j++){
					if(i%j ==0)
						{
					count++;
						}
					if((i > 2) && ((i%2 == 0)||(count >2)))
					{
						break;
					}
			}
			if(count==2)
			{
				flag = true;
				al.add(i);
				sum = sum  + i;
				if(i>400000)
				System.out.println("i value is : " + i + " Ssum value is :" + sum);
			}
			else
			{
				flag = false;
			}
		}
		
	/*	for(int k=0;k<al.size();k++){
			sum = sum + al.get(k);
			//bigInteger.add(longValue(sum)); //sum= sum + al.get(k);
			//if( al.get(k) > 400000)
			//System.out.println("The sum of arraylist of primes : " + sum);
		}*/
		System.out.println("The sum of arraylist of primes : " + sum);
		
	}

}
