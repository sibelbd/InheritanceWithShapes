package inheritance.shape;

/**
 * Created by thatp on 6/12/2017.
 */

public class Cube extends ThreeDShape {

    //variable for the side of a shape
    private double side;
    //empty constructor calls super empty constructor
    public Cube(){
        super();
    }
    //sets shape color and side
    public Cube(String inColor, double inSide){
        super(inColor);
        this.side = inSide;
    }

    //calculates volume
    public double getVolume(){
        return Math.pow(this.side,3.0);
    }

    //toString to show super and side descriptions
    public String toString(){
        return String.format("%s side:%.2f",
                super.toString(), this.side);
    }
}
