package inheritance.shape;

/**
 * Created by thatp on 6/12/2017.
 */

public class Circle extends TwoDShape {
    //variable radius is needed to find the area of a circle
    private double radius;

    //constructors
    //empty constructor just calls super class
    public Circle(){
        super();
    }
    //constructor just sets color and radius
    public Circle(String inColor, double inRadius){
        super(inColor);
        this.radius = inRadius;
    }
    //methods to calculate area and perimeter
    public double getPerimeter(){
        return 2* Math.PI *this.radius;
    }
    public double getArea(){
        return Math.pow(this.radius, 2.0) * Math.PI;
    }

    //created string stating the stuff in the method toString and the radius
    public String toString(){
        return String.format("%s radius:%.2f", super.toString(), this.radius);
    }
}
