package basicp;

public class rtriangle 
{
    public static void main(String[]args)
    {
        int n=7;
      for(int i=1;i<n;i++)//i start from 1 because if it willstart weth 0 it will go negative
      {
        for(int j=0;j<n-1;j++)//n-1 becuse to get condition j<n-1 conditin wrong so it come out of loop and go to next line
        {
           if(j<n-i)     // because it will print gaps
           {
            System.out.print(" ");
           }
           else
           {
            System.out.print("*");
           } 
        }
        System.out.println();
      }
    }
}
