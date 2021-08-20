import java.util.*;
public class PatternDiamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();
        int os=n/2;
        int is=1;
        int p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=os;j++)
            {
                System.out.print("	");
            }
        
            for(int j=p;j<=is;j++)
            {
            System.out.print(j+"	");
            }
            for(int k=is-1;k>=p;k--)
            {
                System.out.print(k+"	");
            }
         System.out.println();
        
        
        if(i<=n/2)
        {
        os--;
        is=is+2;
        p++;
        }
        else
        {
            os++;
            is=is-2;
            p--;
        }
    }

    }
}