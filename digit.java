import java.io.*;
import java.util.Scanner;
public class digit
 {
 public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);
    System.out.println("ener the n");
    char n=sc.next().charAt(0);
    if(n>='0'&&n<='9')
    {
      System.out.println("the given input is digit");
    }
    else
    {
      System.out.println("not a digit");
    }
  }
}   
 
