package inheritance.shape;

/**
 * Created by thatp on 6/7/2017.
 */
public abstract class TwoDShape extends Shape {

    //empty constructor calls empty super
    public TwoDShape(){super();    }

    //constructor sets color
    public TwoDShape(String inColor){
        super(inColor);
    }

    //creates methods to get area and perimeter
    //methods are modified accordingly in subclasses
    public abstract double getPerimeter();
    public abstract double getArea();

    //prints string for  super, perimeter, and area
    public String toString(){
        return String.format("%s perimeter:%.2f area:%.2f",
                super.toString(), this.getPerimeter(),this.getArea());
    }

}
