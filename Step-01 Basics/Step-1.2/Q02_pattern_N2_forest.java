public class Q02_pattern_N2_forest{
    public static void nForest(int n) {
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*"+" ");
           }
           System.out.println();
       }
    }
}