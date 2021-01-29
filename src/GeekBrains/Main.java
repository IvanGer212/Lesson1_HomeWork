package GeekBrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Часть вторая: создание переменных всех изученных типов и присвоение им значений
        byte m = 125;
        short n = 6574;
        int l = 246345;
	    long z = 1748468;
	    float t = 476523.145f;
	    double h = 3974034988.3974983;
	    char x = 'Y';
	    boolean f = true;
	    String string = new String("Hello world!");
	    // Часть третья: создание метода вычисляющего значение выражения и возвращающего его
        System.out.println("Часть третья");
        float r = 25f, y = 14.7f, u = 17.3f, w = 78.17f;
        System.out.println("Значение выражения = " + calculate(r,y,u,w));
        System.out.println("");

        // Часть четвертая: метод принимающий два числа и проверяющий что их сумма лежит в пределах от 10 до 20
        System.out.println("Часть четвертая");
        int c1 = 4, c2 = 20;
        if (compare(c1,c2)) System.out.println("Выражение верно");
        else System.out.println("Выражение не верно");
        System.out.println("");

        // Часть пятая: метод, который определяет положительное ли число или отрицательное.
        System.out.println("Часть пятая");
        int g = 12;
        defSignNum(g);
        System.out.println("");
    }
    // Метод для вычисления выражения a*(b+(c/d))
    public static double calculate (float a,float b, float c, float d){
        double x = a*(b+(c/d));
        return x;
    }

    // Метод для определения лежит ли сумма двух чисел в пределах от 10 до 20
    public static boolean compare (int a, int b){
        int c;
        c= a+b;
        if (c>=10 && c<=20) {
            return true;
        } else return false;
    }

    //
    public static void defSignNum (int a){
        if (a >=0) System.out.println("Число " + a + " - положительное");
        else System.out.println("Число "+ a +" - отрицательное");
    }
}
