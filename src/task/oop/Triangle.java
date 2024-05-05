package task.oop;

public class Triangle extends Figure {
    private int side;

    @Override
    double permit() {
        return side + side + side;
    }

    public int setSide(int side) {
        this.side = side;

        return side;
    }


    public int getSide() {
        return side;
    }

    @Override
    public double square() {
        return 0.5 * side * side;
    }

    public Triangle() {
    }

    public static void main(String[] args) {
        Triangle a = new Triangle();
        System.out.println(a.setSide(25));
        System.out.println(a.getSide());
        System.out.println(a.permit());
        System.out.println(a.square());

    }

}
