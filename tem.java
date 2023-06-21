import java.util.Scanner;
public class tem {
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the celcius c");
    int c = sc.nextInt();
    int f=0;

        if(f==0)
        {
            f=c*9/5+32;
            System.out.println(f+" "+"franheit");
        }
        else 
        {
            System.out.println("invaid");
        }
    }
}
