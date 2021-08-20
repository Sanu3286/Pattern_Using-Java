import java.util.*;
public class Pattern_nc0_To_ncn_Triangle {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n=scn.nextInt();
        int p;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                p=(fact(i))/(fact(j)*fact(i-j));
                System.out.print(p+"	");
            }
        System.out.println();
            
        }
        
    }
public static int fact(int m)
{  int res=1;
    if(m<=1)
    {
        return 1;
    }
    for(int i=2;i<=m;i++)
    {
        res=res*i;
    }
  return res;
    
}
    

    
}