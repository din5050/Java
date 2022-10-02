package homwowrks;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        //Напишите алгоритм, который спрашивает пользователя как его зовут и выводит в консоль “Hello …….. !”

        Scanner sc = new Scanner (System.in);
              System.out.println("Enter your name..");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        //Second level: 1. Создайте строку через new - I study Basic Java!

        String one = new String("I study Basic Java ! ");
        System.out.println(one);

        //Распечатайте последний символ строки. Используем метод String.charAt().
        System.out.println(one.charAt(19));

        // Поэкспериментируйте с методом String.replace() для того, что заменить все буквы 'a' на '*' в переменной String,
        // которая была создана в п.1 этого задания
        System.out.println(one.replace( "s", "#"));


    }
}