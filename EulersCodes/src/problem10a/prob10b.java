package problem10a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class prob10b {

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
					
			for(long j=2;j<=Math.ceil(Math.sqrt(i));j++){
				if(i%j==0){
					count++;
					break;
				}
					
			}
			if(count==0)
			{
				flag = true;
				al.add(i);
				sum = sum  + i;
				
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
		sum = sum +2;
		System.out.println("The sum of arraylist of primes : " + sum);
		
	}

}
