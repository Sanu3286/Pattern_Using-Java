import java.util.*;
public class LowerTriangle {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=n-i)
                {
                    System.out.print("	");
                }
                else
                {
                System.out.print("*	");    
                }
                
            }
            System.out.println("");
        }

    }
}