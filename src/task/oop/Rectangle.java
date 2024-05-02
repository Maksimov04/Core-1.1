package task.oop;

public class Rectangle extends Figure {
    public Rectangle() {
    }

    private int length;

    @Override
    double permit() {
        return (length + width) * 2;
    }

    private int width;

    public int setLength(int length) {
        this.length = length;
        return length;
    }

    public int setWidth(int width) {
        this.width = width;
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double square() {

        return length * width;
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        System.out.println(a.setLength(25));
        System.out.println(a.setWidth(20));
        System.out.println(a.getLength());
        System.out.println(a.getWidth());
        System.out.println(a.permit());
        System.out.println(a.square());
    }


}

