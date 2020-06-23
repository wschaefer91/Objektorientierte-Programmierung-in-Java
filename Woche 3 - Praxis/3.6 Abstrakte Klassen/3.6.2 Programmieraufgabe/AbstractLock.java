abstract public class AbstractLock {
    
    int secretNumber;
    String secretWord;
    int numberOfAttempts;
    
    abstract public boolean openWithSecretNumber(int number, int attempt);
    
    abstract public boolean openWithSecretWord(String word);

}
