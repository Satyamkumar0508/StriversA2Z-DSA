import java.util.Scanner;

public class Q06_sum_even_and_odd{
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int evensum=0;
		int oddsum=0;
		int i=0;
		while(n>0){
			int rem=n%10;
			if(rem%2==0){
				evensum+=rem;
			}
			else{
				oddsum+=rem;
			}
			n=n/10;
		}
		System.out.println(evensum + " "+oddsum);
		
	}
}
