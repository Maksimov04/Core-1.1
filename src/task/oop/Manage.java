package task.oop;

public class Manage extends Employee {

    private int age;
    private String name;

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public String setName(String name) {
        this.name = name;
        return name;
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


    public static void main(String[] args) {
        Manage a = new Manage();

        System.out.println("Manage : " + " Name " + a.setName("ILya") + " : " + "Age" + " " + a.setAge(30));
        System.out.println(a.getName());
        System.out.println(a.getAge());


    }
}


