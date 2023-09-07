package hometask3;

public class CheckNumber {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public void firstNumberRangeCheck (int firstNumber) throws NumberOutOfRangeException {
        if (firstNumber > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
    }
    public void secondNumberRangeCheck (int secondNumber) throws NumberOutOfRangeException {
        if (secondNumber < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
    }
    public void sumCheck (int firstNumber, int secondNumber) throws NumberSumException {
        if (firstNumber+secondNumber < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
    }
    public void zeroCheck (int thirdNumber) throws DivisionByZeroException {
        if (thirdNumber == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }
}
