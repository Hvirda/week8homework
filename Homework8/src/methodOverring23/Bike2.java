package methodOverring23;

public class Bike2 extends Vehicle{
    public void run(){
        System.out.println("Bike running safely");
    }

    public static void main(String[] args) {
        Bike2 b=new Bike2();
        b.run();
    }
}
