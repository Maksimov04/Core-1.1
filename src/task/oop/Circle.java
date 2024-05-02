package task.oop;

public class Circle extends Figure {

    private int radius ;

    @Override
    double permit() {
        return 2 * 3.14 * radius;
    }

    public int setRadius(int radius) {
        this.radius = radius;
        return radius;
    }

    public int getRadius() {
        return radius;
    }

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return 3.14 * radius + radius;
    }

    public static void main(String[] args) {
        Circle a = new Circle();
        System.out.println(a.setRadius(25));
        System.out.println(a.getRadius());
        System.out.println(a.square());
        System.out.println(a.permit());
    }
}

