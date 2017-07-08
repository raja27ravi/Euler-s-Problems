package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem4 {
//check for paalindrome in the 1st loop and do the same in the second and if both are palindrome then
// then product it and check for palindrome, if yes store it , then repeat and check with greater confition
//each time for the first loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int b=999;
		int a = 999;
		long prod =0;
		boolean flag = false;
		List<Long> al = new ArrayList<Long>();
		//System.out.println("Palindrome values are : " + prod);
	for(int i =999;i>=100;i--)
	{
		//System.out.println("Palindrome values are : " + prod);
		for(int j =999;j>=100;j--)
		{
			prod = i*j; 
			flag = checkForPalindrome(prod);
			if(flag)
			{
				al.add(prod);	
				//System.out.println("Palindrome values are : " + prod);
			}
		}
		
	}
	Collections.sort(al);
	///for(int k=0;k <= al.size();k++){
		long value = al.get(al.size()-1);
		System.out.println("Element: " + value);
	//}
	
	}
	
	public static boolean   checkForPalindrome(long prod)
	{  
		 String org = null;
		 String orgrev = null;
		 
		
		org = String.valueOf(prod);
		String reverse = new StringBuffer(org).reverse().toString();
		
		if(org.equalsIgnoreCase(reverse))
		{
			return true;
		}
		
		else
		return false;
	}
	
	

}
