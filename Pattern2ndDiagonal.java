import java.util.*;
public class Pattern2ndDiagonal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("	");
            }
           System.out.println("*	");
            
        }
        

    }
}