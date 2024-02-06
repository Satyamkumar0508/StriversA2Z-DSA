import java.lang.Math;
public class Q04_Switch_case{
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        
        switch(ch){
            case 1:
                return Math.PI * Math.pow(a[0], 2);
            case 2:
               return a[0] * a[1];
            default:
                System.out.println("Error: Invalid  entered.");
                return -1;
        }
        
    }
}