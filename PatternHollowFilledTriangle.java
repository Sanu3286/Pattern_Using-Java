import java.util.*;
public class PatternHollowFilledTriangle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     // write ur code here
     int n=sc.nextInt();
     for (int i=1;i<=n;i++)
     {
         for(int j=1;j<=n;j++)
         {
        if( (i==1 || i==n || i==j || j==n-i+1) || ( (j>n-i+1 && j<i) && (i>n/2+1) ))
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