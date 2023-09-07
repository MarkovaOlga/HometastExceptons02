package hometask3;
//Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
//
//        Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением
//        "Первое число вне допустимого диапазона".
//        Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением
//        "Второе число вне допустимого диапазона".
//        Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением
//        "Сумма первого и второго чисел слишком мала".
//        Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
//        В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
//        - необходимо создать 3 класса собвстенных исключений

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = in.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = in.nextInt();
        System.out.println("Введите третье число: ");
        int thirdNumber = in.nextInt();
        try {
            CheckNumber checkNumber = new CheckNumber();
            checkNumber.firstNumberRangeCheck(firstNumber);
            checkNumber.secondNumberRangeCheck(secondNumber);
            checkNumber.sumCheck(firstNumber,secondNumber);
            checkNumber.zeroCheck(thirdNumber);
            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NumberSumException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (DivisionByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}