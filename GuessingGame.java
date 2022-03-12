import java.util.Random;  
  
  
public class GuessingGame {  
    private static final int MAXGUESSESALLOWED = 6;  
    private int answer;  
    Random generator;  
    private boolean gameOver;  
    private int differential;  
    private int max;  
    private int numGuessesTaken;  
      
    // accessor and Mutator  
    public int getAnswer(){  
        return this.answer;  
    }  
    public void setAnswer(int num){  
        this.answer = num;  
    }  
    public int getMax(){  
        return this.max;  
    }  
    public void setMax(int num){  
        this.max = num;  
    }  
     public int getNumGuessesTaken(){  
        return this.numGuessesTaken;  
    }  
    public void setNumGuessesTaken(int num){  
        this.numGuessesTaken = num;  
    }  
     public int getDifferential(){  
        return this.differential;  
    }  
    public void setDifferential(int num){  
        this.differential = num;  
    }  
    public int MAXGUESSESALLOWED(){  
        return MAXGUESSESALLOWED;  
    }  
      
    // Constructor and method  
    public GuessingGame(){  
        this.max = 0;  
        generator = new Random();  
    }  
    public GuessingGame(int maxValue){  
        this.max = maxValue;  
        generator = new Random();  
    }  
    public void newGame(){  
        answer = generator.nextInt(max);  
        gameOver = false;  
        differential = max;  
        numGuessesTaken = 0;  
    }  
    public String guess(int guessedValue){  
        numGuessesTaken ++;  
        String ans = "",second = "";  
          
        if(differential > (answer - guessedValue)){  
            second = "Getting Warmer";  
        }else{  
            second = "Getting Cooler";  
        }  
          
        if(answer > guessedValue){  
            differential = answer - guessedValue;  
            ans =  "Too Low";  
        }else if(answer < guessedValue){  
            differential = answer - guessedValue;  
            ans =  "Too High";  
        }else if(answer == guessedValue){  
            ans =  "Congratulation";  
            this.gameOver = true;  
            return ans;  
        }  
        if(guessedValue < 0 && guessedValue > max){  
            ans = "Guess is out of Range";  
        }  
          
        if(numGuessesTaken >= MAXGUESSESALLOWED){  
            gameOver = true;  
            second = "You Lose";  
        }  
        return ans + "\n"+second;  
    }  
    public boolean isGameOver(){  
        return gameOver;  
    }  
}  

