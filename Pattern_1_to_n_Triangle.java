import java.util.*;

public class Pattern_1_to_n_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p+"	");
                p++;
            }
         System.out.println(); 
        }
        

    }
}