import java.util.*;

public class PatternArrow {
 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
              if(  ( (j>n/2)  && (j < (n/2+p+1))) ||(i==n/2+1)  )
               {
                System.out.print("*	");
               }
            else
               {
                System.out.print("	");
                }
            }
          System.out.println();
          if(i<=n/2)
            {
              p++;
            }
          else 
            {
           p--;   
            }
        }
    
   }
}



