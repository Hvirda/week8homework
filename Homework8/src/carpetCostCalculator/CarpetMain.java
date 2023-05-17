package carpetCostCalculator;

public class CarpetMain {
    /*
    Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
→ OUTPUT
total= 38.5
total= 36.45
NOTE: All methods should be defined as public NOT public static
     */
    public static void main(String[] args) {


        Carpet c = new Carpet(3.5);
        Floor f1 = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(f1, c);
        System.out.println("Total cost: "+calculator.getTotalCost());
        Carpet c1 = new Carpet(1.5);
        Floor f2 = new Floor(5.4, 4.5);
        Calculator calculator1 = new Calculator(f2, c1);
        System.out.println("Total cost: "+calculator1.getTotalCost());

    }
}
