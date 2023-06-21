public class dac 
{
    public static void main(String[] args) 
    {
        
     {
        char n='%';
        if(Character.isDigit(n))
        {
            System.out.println(n+"is digit");
        }
        else if(Character.isAlphabetic(n))
        {
            System.out.println(n+"is alphabet");
        }
        else 
        {
            System.out.println(n+"is special character");
        }
     }
    }
}    
