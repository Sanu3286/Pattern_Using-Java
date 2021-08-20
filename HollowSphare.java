import java.util.*;

public class HollowSphare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sp=1;
        int str=(n/2)+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=str;j++)
            {
                System.out.print("*	");
            }
            for(int k=1;k<=sp;k++)
            {
                System.out.print("	");
            }
            for(int j=1;j<=str;j++)
            {
                System.out.print("*	");
            }
            if(i<=n/2)
            {
                sp=sp+2;
                str--;
            }
            else
            {
                sp=sp-2;
                str++;
            }
               
        System.out.println();
            
        }

    }
}