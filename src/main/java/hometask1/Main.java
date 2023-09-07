package hometask1;

//Задача 1:
//        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
//        Если число отрицательное или равно нулю,
//        программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
//        В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;

public class Main {
    public static void checkNumber(int number) throws InvalidNumberException {
        if ((number == 0) || (number <0)) {
            throw new InvalidNumberException("Некорректное число");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        try {
            checkNumber(number);
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
