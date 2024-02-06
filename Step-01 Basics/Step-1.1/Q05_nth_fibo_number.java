import java.util.*;
public class Q05_nth_fibo_number{


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int prev1 = 1;
        int prev2 = 1;
        int current = 0;
		 if (n == 1 || n == 2) {
            System.out.println(1);
        } 

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        System.out.println(current);
    }
}