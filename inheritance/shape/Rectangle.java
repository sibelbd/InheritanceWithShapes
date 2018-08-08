package inheritance.shape;

/**
 * Created by thatp on 6/12/2017.
 */
public class Rectangle extends TwoDShape{
    //variables for width and height
    private double length;
    private double width;

    //empty constructor calls empty super
    public Rectangle(){
        super();
    }
    //constructor sets color, length, and width
    public Rectangle( String inColor, double inLength, double inWidth){
        super(inColor);
        this.length = inLength;
        this.width = inWidth;
    }
    //methods to calculate the perimeter and area
    public double getPerimeter(){
        return (this.length + this.width)*2;
    }
    public double getArea(){
        return this.length * this.width;
    }
    //returns string description of length, width, and super description
    public String toString() {
        return String.format("%s length:%.2f width:%.2f", super.toString(), this.length, this.width);
    }

}
