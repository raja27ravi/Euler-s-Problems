package problem2;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		double a = 1;
		double b = 2;
		double c = 0;
		double sum = 0;
		while(c<=4000000)
		{
			c=a+b;
				if(c%2==0)
				{
					sum = sum + c;
				}
			a=b;
			b=c;
		}	
		sum = sum +2;
		System.out.println("the sum of fibnoci numbers : " + sum);
	}
	
	
		
	}

