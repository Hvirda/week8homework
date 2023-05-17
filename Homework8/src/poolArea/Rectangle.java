package poolArea;

public class Rectangle {
    /*
    1. Write a class with the name Rectangle. The class needstwo fields(instance variable) with name
width and length both of type double.
The class needsto have one constructor with parameters width and length both of type double and it
needs to initialize the fields.
In case the width parameter is lessthan 0 it needs to set the width field value to 0.
In case the length parameter islessthan 0 it needsto set the length field value to 0.
Write the following methods (instance methods):
● Method named getWidth without any parameters, it needsto return the value of the width
field.
● Method named getLength without any parameters, it needsto return the value ofthe length
field.
● Method named getArea without any parameters, it needsto return the calculated area
(width * length).

     */
    double length;
    double width;

    public Rectangle(double length, double width) {
        if(width<0 && length<0){
            width=0;
            length=0;
        }
        this.length = length;
        this.width = width;
    }

    public double getLength(){
       return length;
   }

    public double getWidth() {
        return width;
    }
    public double getArea(){
       return length*width;
    }
}
