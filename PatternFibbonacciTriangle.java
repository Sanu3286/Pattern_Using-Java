import java.util.*;
public class PatternFibbonacciTriangle {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int f0=-1;
        int f1=1;
        int p;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                p=f0+f1;
                System.out.print(p+"	");
                f0=f1;
                f1=p;
            }
         System.out.println(); 
        }


    }
}