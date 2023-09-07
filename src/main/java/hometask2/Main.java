package hometask2;
//Задача 2:
//        Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
//        Если второе число равно нулю, программа должна выбрасывать исключение
//        DivisionByZeroException с сообщением "Деление на ноль недопустимо".
//        В противном случае, программа должна выводить результат деления.

import java.util.Scanner;

public class Main {
    public static double divide(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо", dividend);
        }
        return (double) dividend/divisor;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = in.nextInt();
        try {
            double result = divide(number1, number2);
            System.out.println("Результат деления: "+ result);
        } catch (DivisionByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Делимое: " + e.getDividend());
        }
    }
}
