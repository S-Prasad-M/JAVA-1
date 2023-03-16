import java.util.*;
public class CountVC
{    
    public static void main(String[] args) 
    {    
        int v = 0, c = 0;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); 
        str = str.toLowerCase();    
        for(int i = 0; i < str.length(); i++) 
        {   
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            {    
                v++;    
            } 
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
            {   
                c++;    
            }    
        }    
        System.out.println("Number of vowels: " + v);    
        System.out.println("Number of consonants: " + c);    
    }    
}   
