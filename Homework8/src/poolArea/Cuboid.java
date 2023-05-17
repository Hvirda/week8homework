package poolArea;

public class Cuboid extends Rectangle{
        /*
        2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
(instance variable) with name height of type double.
The class needsto have one constructor with three parameters width, length, and height all of type
double. It needsto call the parent constructor and initialize a height field.
In case the height parameter islessthan 0 it needsto set the height field value to 0.
Write the following methods (instance methods):
● Method named getHeight without any parameters, it needsto return the value of height
field.
● Method named getVolume without any parameters, it needsto return the calculated volume.
To calculate volume, multiply the area with height.

         */
    double height;



    public Cuboid(double length, double width, double height){
        super(length, width);
        if (height<0){
            height=0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double volume(){
        return getArea()*height;
    }
}
