package problem12;

import java.math.BigInteger;
import java.util.ArrayList;

public class problem12 {
	//int sum =0;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger bigInteger = new BigInteger("3710728753");
		ArrayList<Integer> al = new ArrayList<Integer>();
		BigInteger  dig =new BigInteger("0");
		BigInteger myBigDiv =new BigInteger("10");
		BigInteger myBigDiv1 =new BigInteger("10");
		int sum =0;
		int count=0;
		
		while(bigInteger.compareTo(BigInteger.ZERO) > 0)
				{
		dig = bigInteger.mod(myBigDiv1);	
		al.add(dig.intValue());
		bigInteger = bigInteger.divide(myBigDiv1);
		//System.out.println("Just to check how the things are going " + dig );
		myBigDiv = myBigDiv.multiply(myBigDiv1);
		count++;
		
							}
		for(int i =0;i<al.size();i++)
		{
			sum =sum + al.get(i);
		}
		for(int i =0;i<al.size();i++)
		{
			System.out.println("The elemnts are : " + al.get(i)+ " count is : " + count);
		}
	System.out.println("Sum of first ten digits is : " + sum);	
	}

}
