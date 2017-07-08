package problem6;

public class problem6 {
//first get the sum and nerxt get the squares of each number and add 
	
	// then find the diff of two
	public static void main(String[] args) {
int a=100;
long sum = 0;
long sum2=0;
for(int i =0 ;i<=a;i++){
	sum  = sum + i;
}
//get the square of the sum
sum = sum * sum;

//now sQUARE EACH NUMBER AND ADD IT IMMEDEIATLEY

for(int i =0 ;i<=a;i++){
	sum2  = sum2 + i*i;
}
long res = sum - sum2;
System.out.println("The sum value is "  + sum);
System.out.println("The sum2 value is "  + sum2);
System.out.println("The diff of the value is : " + res);
}//psvm
	
	
}
