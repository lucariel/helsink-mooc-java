
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if(!this.guessedLetters.contains(letter)){
            this.guessedLetters=this.guessedLetters+letter;
            if(!this.word.contains(letter)){
            numberOfFaults++;
            }
        }
        
        
        // if the letter has already been guessed, nothing happens
        
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String wordNow="";
        for(int i = 0;i<this.word.length();i++){
            String let = this.word.charAt(i)+"";
            
            
            if(this.guessedLetters.contains(let)){
                wordNow =  wordNow+let;
            }
            else{wordNow =  wordNow+"_";}
        }

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        return wordNow;
    }
}
