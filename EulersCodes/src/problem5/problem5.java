package problem5;

import java.util.ArrayList;
import java.util.List;

public class problem5 {
//we have to get all the prime numbers upto the number 20
//then raise it to the max power and see if it less than 20.,if less than 20 multiply and store in a number
	public static void main(String[] args) {
int a=20;
int b = 20;
int lcm  = 1;

 List<Integer> al = new ArrayList<Integer>();
//get all the prime numbers first upto 20
while(a>0)
{
	int count =0;
		for(int j=1;j<=a;j++)
		{
			if(a%j==0)
			{
				count++;
			}
						
		}
		if(count == 2)
		{
			al.add(a);
		}
	
		
	a--;
}
for(int i=0;i<al.size();i++){
	System.out.println("The prime numbers upto 10 are : " + al.get(i));
}
//Now loop through  the elements and get the highest number and add it to the arraylist and take the product
for(int i=0;i<al.size();i++){
	int temp =al.get(i);
	
	while(temp <= b)
	{
		
		temp = temp * al.get(i);
		
	}
	if(temp >=b)
	{
		temp = temp / al.get(i);
	}
	
	lcm = lcm * temp;
}
	System.out.println("LCM is : " + lcm);
	}
}
