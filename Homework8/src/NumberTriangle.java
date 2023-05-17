import java.util.Scanner;

public class NumberTriangle {
    /*
    6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
     */
    public static void main(String[] args) {
        traingle();
    }
    public static void traingle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int rows=sc.nextInt();

        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");

        }

    }
}