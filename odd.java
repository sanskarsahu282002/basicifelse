public class odd{
    public static void main(String[] args) {
        int n=10;
        int count=0;
        System.out.println(3);
        for(int i=3;i<n-1;)
        {
          if(2%i==0)
           {
            count++;
           }
           else if(count<0)
           {
            System.out.print(i);
           }
           else{
            i=i+2;
            System.out.println(i);
           }
        }
        
    }
    
}
