import java.util.Scanner;
public class posneg 
{
     public static void main(String[] args)
      {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n");
    int n=sc.nextInt();
    if(n<0)
    {
        System.out.println("the number is neagative");
    }
    else if(n>0)
    {
        System.out.println("the number is postive");
    }
     }
}
