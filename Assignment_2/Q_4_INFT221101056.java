 //Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
 
 class Circle {
    private double radius;

    public double getRadius() {
        return this.radius;
    }
 
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI*radius*radius;
    }

    public double circumference() {
        return 2*Math.PI*radius;
    }
}

class Q_4_INFT221101056 {
    public static void main(String[] args) {
    Circle obj = new Circle();
    obj.setRadius(4);
    System.out.println("Radius of circle: "+obj.getRadius());
    System.out.println("Area of circle: "+obj.area());
    System.out.println("Circumference of circle: "+obj.circumference());
    }
}