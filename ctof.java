import java.util.Scanner;

public class ctof {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the franheit f");
        int f=sc.nextInt();
        int c=0;
        if(c==0)
        {
            c=(f-32)*5/9;
            System.out.println(c+" "+"franheit");
        }
    }
}
