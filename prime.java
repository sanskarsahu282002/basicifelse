import java.util.*;
public class prime {//the whose factor is 1 and itself is prime no.
     public static void main(String[] args) 
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter n");
      int n =sc.nextInt();
      System.out.println(n);
      int count=0;
      for(int i=2;i<n-1;i++)//prime no.'s are(2,3,5,7.......)
      {
        if(n%i==0)
        {
          count++;//count value is zero which change to 1;5
        }
      }
      if(count>0)
      {
        System.out.println("not a prime");
      }
      else
      {
        System.out.println("prime");
      }
      }
     }
    
  

