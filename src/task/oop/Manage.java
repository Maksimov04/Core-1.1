package task.oop;

public class Manage extends Employee {

    private int age = 25;
    private String name = "Ilya";

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    double name() {
        return name();
    }

    public Manage() {
    }

    @Override
    double age() {
        return age();
    }

    void speak() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Мэнеджер : Имя : " + name + ";" + " Возраст : " + age);
        }

    }

    public static void main(String[] args) {
        Manage a = new Manage();
        a.speak();
        a.setAge(25);
        a.setName("Masha");
        a.getAge();
        a.getName();

    }
}


