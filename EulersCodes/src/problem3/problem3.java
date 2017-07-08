package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class problem3 {
//check for the divisors and then if yes then pass the number to a method for checking the prime
//if the number is prime then add the number to an collection and sort it in descending order and we 
//get the highest number
	public static void main(String[] args) {
	
	long  num = 600851475143L;
	boolean flag = false;
	long reqnum =0; 
	int noofprimefac =0;
	List<Double> a = new ArrayList<Double>();
	for(long i =1;i<=num;i++)
	{
		flag = false;
		if(num%i == 0)
		{
			
			flag = checkForPrime(i);
			//System.out.println("The flag is  " + flag + " num is " + num + " i values is "  + i);
			
		}
		
		if(flag == true)
		{
			//System.out.println("The i values is : " + i);
			reqnum =i;
			noofprimefac++;
		}
		if(i > Math.sqrt(num))
		{
			break;
		}
		
		
	} 
	System.out.println("The required highest prime factor is :  "+ reqnum + " and number of prime factors :" + noofprimefac);
	 
	
	}
	
	public static  boolean checkForPrime(long num)
	{
		long j=1;
		int count=0;
		for(j=1;j<=num;j++)
		{
			if(num%j==0)
			{
				count++;
			}
						
		}
		if(count == 2)
		{
			return true;
		}
		else
		{

			return false;
		}
		
	}
}
