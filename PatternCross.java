import java.util.*;
public class PatternCross {

    public static void main(String[] args) {
        

        // write ur code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j||j==n-i+1)
                {
                 System.out.print("*	");
                }
                else
                {
                    System.out.print("	");
                }
            }
           System.out.println();
            
        }
    

    }
}