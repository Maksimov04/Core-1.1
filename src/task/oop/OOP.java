package task.oop;

public class OOP {
    public static void main(String[] args) {
        Parent a = new Parent();
        System.out.println(a.sum(2, 2));
        System.out.println(a.sumFromString("4", 2));
        System.out.println(a.returnString("HELLO"));
        System.out.println("I am Parent");
        System.out.println(a.concatenateStrings("Ban", "Ana"));

        Child1 b = new Child1();
        System.out.println(b.sum(4, 4));
        System.out.println(b.sumFromString("2", 2));
        System.out.println(b.returnString("Banana"));
        System.out.println("I am Child1");
        System.out.println(b.concatenateStrings("авиамодель", "авиамодель"));

        Child2 c = new Child2();
        System.out.println(c.sum(4, 4, 4));
        System.out.println(c.sumFromString("2", "2", "2"));
        System.out.println(c.concatenateStrings1("Ana", "Nas"));
        String str = "Ilya";
        System.out.println("I am Child2" + " " + str);
        System.out.println(c.concatenateStrings2("Ba", "Na", "Na"));














    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте класс Parent(Родитель) и создайте для него 5 методов.
    //  1. Метод, принимающий 2 числа и возвращающий их сумму.
    //  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
    //  3. Метод, принимающий строку и возвращающий ее.
    //  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
    //  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.

    public static class Parent {
        public int sum(int a, int b) {

            return a + b;


        }

        public int sumFromString(String str, int num) {

            return Integer.parseInt(str) + num;

        }

        public String returnString (String str) {

            return str;
        }

        public void printParent() {

            System.out.println();

        }

        public String concatenateStrings(String str1, String str2) {
            return str1.concat(str2);


        }


    }


    // TODO: Создайте класс Child1 и переопределите все 5 методов.
    //  1. Первый метод переопределите так, что вместо суммы первый метод перемножает числа, а не складывает.
    //  2. Второй метод переопределите, чтобы получившееся число после суммирования умножалось на 2.
    //  3. Третий метод переопределите, чтобы возвращал только первую букву из строки.
    //  4. Четвертый метод выводит на экран "I am Child1".
    //  5. Пятый метод после слияния двух строк должен обрезать строку и вернуть только ее половину.

    public static class Child1 extends Parent {
        @Override
        public int sum(int a, int b) {

            return a * b;
        }

        @Override
        public int sumFromString(String str, int num) {

            return (Integer.parseInt(str) + num) * 2;
        }

        @Override
        public String returnString (String str) {


            return String.valueOf(str.charAt(0));
        }

        @Override
        public void printParent() {

            System.out.println();
        }

        @Override
        public  String concatenateStrings(String str1, String str2) {

            return  str1.concat(str2).substring(0,(str1.length()+str2.length())/2);

        }
    }


    // TODO: Создайте класс Child2 и перегрузите методы.
    //  1. Первый метод примет 3 числа и сложит их.
    //  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
    //  3. Третий метод примет две строки и вернет их конкатенацию.
    //  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
    //  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.

     public static class Child2 extends Parent {


        public int sum(int a, int b, int c) {
            return a + b + c;
        }


        public int  sumFromString(String str1, String str2, String str3) {
            return Integer.parseInt(str1) + Integer.parseInt(str2) + Integer.parseInt(str3);
        }


        public String concatenateStrings1(String str1, String str2) {

            return str1.concat(str2);
        }

        public void printChild2 (String srt) {


            System.out.println("I am Child2"+srt);
        }


        public String concatenateStrings2(String str1, String str2, String str3) {

            return (str1.concat(str2).concat(str3));

        }
    }


    // TODO: Создайте абстрактный класс "Фигура", в котором определены общие свойства и методы для всех геометрических фигур
    //  (например, метод для расчета площади).
    //  От него унаследуйте классы "Круг", "Прямоугольник" и "Треугольник", переопределив специфичные методы для каждой фигуры.





    // TODO: Создайте абстрактный класс "Сотрудник", в котором определены общие характеристики для всех сотрудников (например, имя, возраст).
    //  Создайте подклассы для различных типов сотрудников (например, "Менеджер", "Работник склада"),
    //  в которых можно описать специфичные методы и свойства.


    abstract class Sotrydnic {
        String name;
        int age;

        abstract void informacia();


    }

    class Manage extends Sotrydnic {

        String name = "Nikolai";
        String name1 = "Ilya";
        int age = 33;
        int age1 = 24;

        public void informacia() {

            System.out.println("Manage 1: = " + name + " " + age);
            System.out.println("Manage 2: = " + name1 + " " + age1);
        }


    }

    class RabotnicSklada extends Sotrydnic {

        String name = "Dima";
        String name1 = "Petr";
        int age = 44;
        int age1 = 45;

        public void informacia() {

            System.out.println("RabotnicSklada 1: = " + name + " " + age);
            System.out.println("RabotnicSklada 2 : = " + name1 + " " + age1);
        }
    }

}




