import java.util.*;

public class Pattern_w {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
		
			int n= scn.nextInt();
			for(int i=1;i<=n;i++)
			{
			    for(int j=1;j<=n;j++)
			    {
			        if(j==1 || j==n || (i==j && i>n/2) || (j==n-i+1 && i>n/2 ))
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
}