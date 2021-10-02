import java.util.*;
public class Wordguess {


    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        String secretword="Apple";
        String guessword="";
        int attempt=0;
        int maxattempt=3;
        boolean win=false;
        while(!guessword.equals(secretword)&&!win)
        {
            if(attempt<maxattempt)
            {
                System.out.println("Enter A Guess");
                guessword=sc.nextLine();
                attempt++;
            }
            else
            {
                win=true;
            }
        }
        if(win)
        {
            System.out.println("You Lose!!");
        }
        else
        {
            System.out.println("You Win and You Used "+attempt+"attempts");
        }
        // TODO code application logic here
    }
    
}
