public class Main {

    public static void main(String[] args) {
        /*HangmanLogic logic = new HangmanLogic("parameter");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();*/
        
        HangmanLogic l = new HangmanLogic("kissa");
System.out.println("guessing: A, D, S, F, D");
l.guessLetter("A");   // correct
l.guessLetter("D");   // wrong
l.guessLetter("S");   // correct
l.guessLetter("F");   // wrong
l.guessLetter("D");   // This should not have any effect on the number of faults since D was already guessed
System.out.println("guessed letters: "+l.guessedLetters());
System.out.println("number of faults: "+l.numberOfFaults());
        System.out.println(l.hiddenWord());
        
        
    }
}
