import java.util.*;
public class PatternIncDecTriangle {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     // write ur code here
     int n=sc.nextInt();
     int sp=2*(n-1)-1;
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print(j+"	");
         }
         for(int k=1;k<=sp;k++)
         {
             System.out.print("	");
         }
         if(i!=n)
         {
         for(int j=i;j>=1;j--)
         {
             System.out.print(j+"	");
         }
         }
         else
         {
            for(int j=i-1;j>=1;j--) 
            {
              System.out.print(j+"	");   
            }
         }
             
         
         sp=sp-2;
         System.out.println();
         
     }
     
     

 }
}