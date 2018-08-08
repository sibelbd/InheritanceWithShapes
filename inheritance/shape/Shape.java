package inheritance.shape;

/**
 * Created by thatp on 6/7/2017.
 */
public class Shape {
    //variable for color
    private String color;

    //empty constructor sets color to grey
    public Shape(){
        this.color = "grey";
    }
    //constructor sets color
    public Shape(String inColor){
        this.color = inColor;
    }

    //mutator method for color
    public void setColor(String in){
        this.color = in;
    }
    //accessor method for color
    public String getColor(){
        return this.color;
    }

    //returns string for containing class name and description of color
    //this is the super method in the methods toString of other classes
    //in this package
    public String toString(){
        return String.format("%s color:%s",
                this.getClass().getSimpleName(), this.color);
    }
}