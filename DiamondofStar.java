import java.util.*;

public class DiamondofStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n/2;
        int str=1;
        // write ur code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print("	");
            }
            for(int k=1;k<=str;k++)
            {
                System.out.print("*	");
            }            
            if(i<=n/2)
            {
                sp--;
                str=str+2;
            }
            else
            {
                sp++;
                str=str-2;
            }
        System.out.println();
        }
        

    }
}