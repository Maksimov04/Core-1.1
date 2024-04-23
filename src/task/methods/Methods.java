package task.methods;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        // Вызовы ваших методов

    }

    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте метод который вернет сумму двух чисел
    int sum1(int a, int b) {
        int c = a + b;
        return c;
    }


    // TODO: Создайте метод который вернет сумму двух переданных строк
    String sum2(String a, String b) {

        String c = a + b;
        return c;

    }


    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
    //  обернуть их в строку и вернуть результат строкой


    public static String sum3(String b, int a) {

        String text = "";

        int b1 = Integer.parseInt(text);
        int sum = (a + b1);

        return Integer.toString(sum);

    }


// TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
//  число которое передается как int , то пусть метод вернет false , а если меньше , то true

    public boolean sum4(String b, int a) {


        String text = "";
        int b1 = Integer.parseInt(text);
        boolean c = (b1 > a);
        return c;
    }


// TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
//  если обе false верни false

    public boolean equals(boolean a, boolean b) {
        boolean a1 = true;
        boolean b1 = true;
        boolean c = (a1 == b1);

        return equals(c);
    }


    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean sum5(int a) {

        return (a % 2 == 0);
    }


// TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
//  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"

    public static String sum6(int[] array) {

        int max = 6;
        for (int i : array) {
            if (i % 2 == 0) {
                max++;
            }


        }

        return String.valueOf((max));
    }


// TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
//  массива который подается в аргументы  и сложите все элементы в новый массив и верните его

// TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
//  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел

    public static String sum7(int[] Array) {

        int[] a = new int[4];
        int sum = 0;
        a[0] = 2;
        a[1] = 2;
        a[2] = 2;
        a[3] = 2;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return Arrays.toString(a);
    }

// TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах

    public static int age(int a) {

        int age = 25;
        int months = 12;

        return (age * months);
    }


    public static int age1(int a) {

        int age = 25;
        int minutesPerYear = 525600;

        return (age * minutesPerYear);
    }


    public static int age3(int a) {

        int age = 25;
        int hoursPerYear = 8760;

        return (age * hoursPerYear);
    }
// TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра

    public static boolean name(String a, String b) {


        return (a == b);
    }


    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int myMetod(int[] array) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int x = 7;
        int xIndex = -1;


        int i;
        for (i = 0; i < array1.length; i++) {
            if (array1[i] == x) {
                xIndex = i;

            }
        }
        return xIndex;
    }


// TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке

    public static int chek1(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') {
                count++;
            }
        }
        return count;


    }

    // TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
    public static String wallet(int summation, int score) {
        if (score > summation) {
            return " balance is negative ";
        } else if (summation <= 0) {
            return "amount in wallet : = 0 ";
        } else {
            int remainder = summation - score;
            return " Wallet balanc  : " + remainder;


        }
    }


}
