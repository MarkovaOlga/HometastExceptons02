package hometask3;

public class NumberOutOfRangeException extends Exception{
    private int number;

    public NumberOutOfRangeException (String message) {
        super(message);
    }
}
