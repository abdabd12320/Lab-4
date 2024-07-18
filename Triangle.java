public class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle() {
        this(0.0,0.0);
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculateCircumference() {
        return height * 3;
    }

    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                "} ";
    }
}
