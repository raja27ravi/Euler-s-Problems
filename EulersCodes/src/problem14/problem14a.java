package problem14;

import java.util.ArrayList;
import java.util.List;

public class problem14a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i=9;
		long num1=1000000;
		long reqnum =0;
		List<Long> al = new ArrayList<Long>();
		int count =0;
		int maxcount =0;
		
			count =0;
			
			
				while(i>1){
					if(i%2==0)
					{
						i = i /2;
				
					}
						else{
							i = 3*i + 1;
							}
				count++;
				}//while loop
				count = count+1;
			
		System.out.println("count is : " + count);
		
	
	}

}
