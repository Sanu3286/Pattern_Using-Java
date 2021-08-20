import java.util.*;
public class HollowDiamond {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     // write ur code here
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n;j++)
         {
             if(j==n/2-i+2 || j==n/2+i || i==n/2+j || i==n+n/2+1-j )
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