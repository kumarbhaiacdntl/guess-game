import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.Scanner;  
  
public class GuessingGameTester {  
    public static void main(String[] args) throws IOException {  
        String choice = "";  
        Scanner inp = new Scanner(System.in);  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        while(!choice.equals("n")){  
              System.out.println("Welcome To Guessing Game");  
              System.out.println("Enter the maximum number");  
              int number = inp.nextInt();  
              GuessingGame game;  
              game = new GuessingGame(number);  
              game.newGame();  
              while(!game.isGameOver()){  
                  System.out.println("Enter your guess, remember it must be between 0 and "+game.getMax());  
                  int numb = inp.nextInt();  
                  String ans;  
                  ans = game.guess(numb);  
                  System.out.println(ans);  
                    
              }  
              System.out.println("Would you like to play again, Enter y for Yes and n for No");  
              String ch = br.readLine();  
              choice = ch;  
        }  
    }  
}  
