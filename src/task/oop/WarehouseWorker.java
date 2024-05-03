package task.oop;

public class WarehouseWorker extends Employee {

    private int age = 28;

    private String name = " Dima";


    @Override
    double name() {
        return name() ;
    }

    @Override
    double age() {
        return age  ;
    }

    public WarehouseWorker() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void speak() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Работник склада  : Имя : " + name + ";" + " Возраст : " + age);


        }
    }

    public static void main(String[] args) {
        WarehouseWorker a = new WarehouseWorker();
        a.speak();
        a.getAge();
        a.getName();
        a.setAge(26);
        a.setName("Petr");


    }
}
