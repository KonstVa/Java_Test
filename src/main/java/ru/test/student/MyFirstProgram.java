package ru.test.student;

public class MyFirstProgram {

    public static void main(String[] args)
    {
        String somebody = "world";
        hello("пробник 1");
        hello("пробник 2");
        hello("пробник 3 ");
        double l = 5;
        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area (a, b));
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
    }
    public static void hello(String somebody) // метод возвращает пустоту (ничего)
    {
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area (double len){ // метод возращает результат умножения даблов, на вход принимает дабл
        return len*len;
    }

    public static double area(double a, double b){ // метод возращает результат умножения даблов, на вход принимает 2 дабла
        return a * b;
    }
}
