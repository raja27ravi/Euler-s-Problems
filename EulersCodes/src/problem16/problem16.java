package problem16;

import java.math.BigInteger;

public class problem16 {
	public static void main(String[] args) {
		long num=0;
		BigInteger bigInteger = new BigInteger("0");
	//	BigInteger number = BigInteger.probablePrime(, rnd)
		BigInteger bigInteger1 = new BigInteger("0");
		long  tempnum =0;
		long rem =0;
		double base =2;
		double pow =1000;
		
		bigInteger =  BigInteger.valueOf((long) Math.pow(base, pow));
		System.out.println("Two power of " + pow + " is :" + bigInteger);
		tempnum = num;
		long sum=0;
		while(tempnum>0)
		{
			rem = tempnum%10;
			sum = sum + rem;
			tempnum = tempnum/10;
					
		}
		
		System.out.println("The sum of numbers : "  + sum);
		
		
	}
}
