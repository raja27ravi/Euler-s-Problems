package problem1;

public class Problem1 {

	public static void main(String[] args) {
		long sum = 0;
		
		for(int i =0;i<1000;i++)
		{
			if(i%3 == 0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of numbers for multiples of 3 and 5 is : " + sum );

	}

}
