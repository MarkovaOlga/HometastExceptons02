package hometask1;

public class InvalidNumberException extends Exception{

    private int number;
    public InvalidNumberException(String message) {
        super(message);
    }
}
