public class EvenDigitSum {
    /*
    11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
     */
    public static void main(String[] args) {
        int a=getEvenDigitSum(1238);
        System.out.println(a);
    }
    public static int getEvenDigitSum(int number){
        int sum=0;
        if (number<0) {
            return -1;                //return -1 if entered number <0
        }while (number>0) {           //continue untill entered value is >0
            if (number%2==0) {        // true if reminder is 0(even)
                sum += number%10;     //number%10 gives last digit and stor value in sum than next time add number to sum
            }
            number/=10;               //gives second last digit
        }
        return sum;                    //return sum variable value
    }
}
