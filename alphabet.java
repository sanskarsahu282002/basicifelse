import java.util.Scanner;
public class alphabet
 {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input");
        char n=sc.next().charAt(0);
        if(Character.isLetter(n))
        {
            System.out.println("alphabet");
        }
        else{
            System.out.println("not");
        }
    }
}
