package inheritance.shape;

/**
 * Created by thatp on 6/12/2017.
 */
public abstract class ThreeDShape extends Shape {

    //empty constructor calls super
    public ThreeDShape(){
        super();
    }
    //constructor sets color
    public ThreeDShape(String inColor) {
        super(inColor);
    }
    //creates abstract method to get volume
    //this is modified in subclasses to fit the
    //appropriate shape
    public abstract double getVolume();
    //Prints super and volume of shape
    public String toString(){
        return String.format("%s volume:%.2f",
                super.toString(), this.getVolume());
    }
}
