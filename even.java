public class even {
     public static void main(String[] args) {
        int n=10;
        int count=0;
        System.out.println(2);
        for(int i=2;i<10;i++)
        {
            if(2%i!=0)
            {
                count++;
            }
            if(count>0)
            {
                i++;
                System.out.println(i);
            }
        }
    }
}
