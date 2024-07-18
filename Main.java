public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle();
        circle3.setRadius(6);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(8,10);
        Triangle triangle3 = new Triangle();
        triangle3.setHeight(2);
        triangle3.setBase(5);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3,7);
        Rectangle rectangle3 = new Rectangle();
        rectangle3.setHeight(9);
        rectangle3.setWidth(1);

        System.out.println("Circle1:");
        System.out.println(circle1.toString());
        System.out.println(circle1.getRadius());
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculateCircumference());

        System.out.println("Circle2:");
        System.out.println(circle2.toString());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.calculateArea());
        System.out.println(circle2.calculateCircumference());

        System.out.println("Circle3:");
        System.out.println(circle3.toString());
        System.out.println(circle3.getRadius());
        System.out.println(circle3.calculateArea());
        System.out.println(circle3.calculateCircumference());

        System.out.println("--------------------------------");

        System.out.println("Triangle1:");
        System.out.println(triangle1.toString());
        System.out.println(triangle1.getHeight());
        System.out.println(triangle1.getBase());
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle1.calculateCircumference());

        System.out.println("Triangle2:");
        System.out.println(triangle2.toString());
        System.out.println(triangle2.getHeight());
        System.out.println(triangle2.getBase());
        System.out.println(triangle2.calculateArea());
        System.out.println(triangle2.calculateCircumference());

        System.out.println("Triangle3:");
        System.out.println(triangle3.toString());
        System.out.println(triangle3.getHeight());
        System.out.println(triangle3.getBase());
        System.out.println(triangle3.calculateArea());
        System.out.println(triangle3.calculateCircumference());

        System.out.println("--------------------------------");

        System.out.println("Rectangle1:");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculateCircumference());

        System.out.println("Rectangle2:");
        System.out.println(rectangle2.toString());
        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculateCircumference());

        System.out.println("Rectangle3:");
        System.out.println(rectangle3.toString());
        System.out.println(rectangle3.getHeight());
        System.out.println(rectangle3.getWidth());
        System.out.println(rectangle3.calculateArea());
        System.out.println(rectangle3.calculateCircumference());

    }
}