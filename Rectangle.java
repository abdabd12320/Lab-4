public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle()
    {
        this(0.0,0.0);
    }

    public Rectangle(double height,double width)
    {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    @Override
    public double calculateArea()
    {
        return height * width;
    }

    @Override
    public double calculateCircumference()
    {
        return (2 * height) + (2 * width);
    }

    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                "} ";
    }
}
