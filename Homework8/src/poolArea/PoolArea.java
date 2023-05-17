package poolArea;

public class PoolArea {
    public static void main(String[] args) {
        Rectangle rc=new Rectangle(5,10);
        System.out.println(rc.getLength());
        System.out.println(rc.getWidth());
        System.out.println(rc.getArea());

        Cuboid  cb=new Cuboid(5,10,5);
        System.out.println(cb.getLength());
        System.out.println(cb.getWidth());
        System.out.println(cb.getArea());
        System.out.println(cb.getHeight());
        System.out.println(cb.volume());


    }
}
