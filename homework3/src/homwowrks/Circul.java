package homwowrks;

import java.util.Scanner;

public class Circul {
    //First level: 1. Напишите алгоритм, который получает радиус от пользователя через терминал,
    // считает площадь окружности и выводит в терминал:
    // “The area of a circle with radius …..”.
    //(Формула для вычисления площади окружности 3.14rr) S = π × r2;  S = 3.14 * r*r;
    private static float getArea(int r)
    {
        return 3.14f * r * r;
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Please, enter a radius value...");
        int r = sca.nextInt();

        System.out.println ("The area of a circle with radius " + r + " is " + getArea(r));
    }
}
