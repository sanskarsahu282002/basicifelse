import java.util.Scanner;
public class ulcase
{
 public static void main(String[] args) 
 {    
  Scanner sc = new Scanner(System.in);
  System.out.println("enter n");
  char n = sc.next().charAt(0);
  if('A'>=n||n<='Z')
  {
    System.out.println("upercase");
  }
  else
  {
    System.out.println("lowercase");
  }
 }
}
