package hometask3;

public class DivisionByZeroException extends Exception{
    private int dividend;

    public DivisionByZeroException (String message) {
        super(message);
    }
}
