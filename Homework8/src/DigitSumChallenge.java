public class DigitSumChallenge {
    /*
    Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1)should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
Hint: Use n % 10 to extract the least-significant digit.
Use n = n / 10 to discard the least-significant digit.
The method needs to be static
     */
    public static void main(String[] args) {
        int a=digitSum(123);
        System.out.println("sum of digit: "+a);
    }
    public static int digitSum(int number){
        int sum=0;
        if(number>=10 || number>0){
            while(number>0) {
                sum = sum + number % 10;   //last digit(number % 10) and sum of last digit
                number = number / 10;      //second last digit
            }
        }else {
            return -1;

        }
        return sum;
    }

}
