package org.example.seminar1;

import java.util.InputMismatchException;
import java.util.Scanner;
// Задача 2:
//Напишите программу, которая запрашивает у пользователя два числа и выполняет
// их деление. Если второе число равно нулю, программа должна выбрасывать исключение
// DivisionByZeroException с сообщением "Деление на ноль недопустимо". В противном случае,
// программа должна выводить результат деления.

public class HW2 {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Задача № 2 ======");
        try {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            divide(a, b);
        } catch (InputMismatchException e1) {
            System.out.println("Ошибка: некорректный ввод. Вводите целые числа!");
        }
        sc.nextLine();
        System.out.println();
    }


    public static void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        } else {
            System.out.println(a / b);
        }
    }

    private static class DivisionByZeroException extends Throwable {
        public DivisionByZeroException(String s) {
        }
    }
}


