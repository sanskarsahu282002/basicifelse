public class sam 
{
 public static void main(String[] args) 
 {
for(int i=1;i<21;i++)
{
    if(i%2==0)
    {
        if(i<10)
        {
            System.out.print(0);
        }
        System.out.println(i);
    }
    else if(i%2!=0)
    {
        if(i<10)
        {
            System.out.print(0);
        }
        System.out.print(i+" ");
    }
}
    
 }
}

