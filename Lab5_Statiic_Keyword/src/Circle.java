public class Circle {


    private static final double PI=3.141519;
    private double radius;


    public Circle(double radius){
        this.radius=radius;
    }


    public double calculateArea(){
        double area = PI * radius * radius;
        return area;
    }





}
