package task.oop;

public class WarehouseWorker extends Employee {

    private int age;

    private String name;


    @Override
    double name() {
        return name();
    }

    @Override
    double age() {
        return age;
    }

    public WarehouseWorker() {
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public static void main(String[] args) {
        WarehouseWorker a = new WarehouseWorker();
        System.out.println("Warehouse worker :" + " Name " + a.setName("Petr") + " : " + "Age " + a.setAge(27));
        System.out.println(a.getAge());
        System.out.println(a.getName());


    }
}
