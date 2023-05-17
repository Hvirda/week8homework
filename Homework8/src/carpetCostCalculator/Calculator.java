package carpetCostCalculator;

public class Calculator {
    /*
    3. Write a class with the name Calculator. The class needstwo fields(instance variables) with name
floor of type Floor and carpet of type Carpet.
The class needsto have one constructor with parameters floor of type Floor and carpet of type Carpet
and it needsto initialize the fields.
Write the following methods(instance methods):
● Method named getTotalCost without any parameters, it needsto return the calculated total
cost to cover the floor with a carpet
     */
    Floor floor;
    Carpet carpet;
    public Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}
