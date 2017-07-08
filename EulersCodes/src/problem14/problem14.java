package problem14;

import java.util.ArrayList;
import java.util.List;

public class problem14 {
	
	
	public static void main(String[] args) {
		long num=1000000;
		long num1=1000000;
		long reqnum =0;
		List<Long> al = new ArrayList<Long>();
		int count =0;
		int maxcount =0;
		
		for(long j =0;j<num;j++){
			count =0;
			long i=0;
			i=j;
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
				if(j==0){
					maxcount = count;
				}
				//System.out.println("** count is : " + count);
				//System.out.println("--Max count is " + maxcount);
				if(count>maxcount)
				{
					System.out.println("** count is : " + count);
					System.out.println("--Max count is " + maxcount);
					maxcount =count;
					reqnum =j;
				
				//	System.out.println("The required num under " + num + " with maximum erms is : " + reqnum);
				}
		}//for loop
		System.out.println("The required num under " + num + " with term  : " + reqnum + " and max number of sequnence numbes : " + maxcount);
		
	}//main method
	
}
