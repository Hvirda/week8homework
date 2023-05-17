import java.util.Scanner;

public class MinAndMaxInputChallenge {
    /*
    2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
     */
    public static void main(String[] args) {
        minMax();
    }

    public static void minMax() {


        int min = 0;
        int max = 0;
        int count = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            boolean b = sc.hasNextInt();
            if (b) {
                int n = sc.nextInt();            //user input
                if (count == 0 || n < min) {     //gives countloop || min value
                    min = n;
                }
                if (count == 0 || n > max) {     //gives countloop || max value
                    max = n;
                }
                count++;                       //loopcount increment
            } else {
                break;
            }
        }
            if (count > 0) {                     //loop teminate if value>0
                System.out.println("max"+max);
                System.out.println("min"+min);
            } else {
                System.out.println("not valid");
            }
        }

    }



//
