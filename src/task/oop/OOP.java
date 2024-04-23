package task.oop;

public class OOP {
    public static void main(String[] args) {

    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте класс Parent(Родитель) и создайте для него 5 методов.
    //  1. Метод, принимающий 2 числа и возвращающий их сумму.
    //  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
    //  3. Метод, принимающий строку и возвращающий ее.
    //  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
    //  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.

    public class Parent {
        public int sum(int a, int b) {

            return a + b;


        }

        public int sum1(String b, int a) {

            return Integer.parseInt(b) + a;

        }

        public String sum3(String a) {

            return a;
        }

        public void print() {

            System.out.println();

        }

        public String sum4(String a, String b) {
            return a.concat(b);


        }


    }


    // TODO: Создайте класс Child1 и переопределите все 5 методов.
    //  1. Первый метод переопределите так, что вместо суммы первый метод перемножает числа, а не складывает.
    //  2. Второй метод переопределите, чтобы получившееся число после суммирования умножалось на 2.
    //  3. Третий метод переопределите, чтобы возвращал только первую букву из строки.
    //  4. Четвертый метод выводит на экран "I am Child1".
    //  5. Пятый метод после слияния двух строк должен обрезать строку и вернуть только ее половину.

    public class Child1 extends Parent {
        @Override
        public int sum(int a, int b) {

            return a * b;
        }

        @Override
        public int sum1(String b, int a) {

            return (Integer.parseInt(b) + a) * 2;
        }

        @Override
        public String sum3(String a) {


            return String.valueOf(a.charAt(0));
        }

        @Override
        public void print() {

            System.out.println("I am Child1");
        }

        @Override
        public String sum4(String a, String b) {

            return a.substring(0, 6);

        }
    }


    // TODO: Создайте класс Child2 и перегрузите методы.
    //  1. Первый метод примет 3 числа и сложит их.
    //  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
    //  3. Третий метод примет две строки и вернет их конкатенацию.
    //  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
    //  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.

    class Child2 extends Parent {


        public int sum(int a, int b, int c) {
            return a + b + c;
        }


        public int sum1(String a, String b, String c) {
            return Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c);
        }


        public String sum2(String a, String b) {

            return a.concat(b);
        }


        public String sum3(String a, String b, String c) {

            return (a.concat(b).concat(c));

        }
    }


    // TODO: Создайте абстрактный класс "Фигура", в котором определены общие свойства и методы для всех геометрических фигур
    //  (например, метод для расчета площади).
    //  От него унаследуйте классы "Круг", "Прямоугольник" и "Треугольник", переопределив специфичные методы для каждой фигуры.


    abstract class Figura {
        int kolichestvoStoron = 0;

        abstract void ploshad();

    }

    class Kryg extends Figura {
        int kolichestvoStoron = 0;
        int radius = 3;

        public void ploshad() {


            System.out.println("Ploshad kryga = " + 3.14 * radius + radius);

        }
    }

    class Prymougolnik extends Figura {
        int kolichestvoStoron = 4;
        int storona1 = 5;
        int storona2 = 8;

        public void ploshad() {
            System.out.println("Ploshad prymougolnika = " + storona1 * storona2);

        }
    }

    class Treygolnik extends Figura {
        int kolichestvoStoron = 3;
        int storona1 = 4;

        public void ploshad() {
            System.out.println("Ploshad treygolnik = " + storona1 * storona1);


        }

    }


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




