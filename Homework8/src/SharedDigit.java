public class SharedDigit {
    /*
    13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
     */
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,21));
    }
    public static boolean hasSharedDigit(int a,int b){
        if ((a<10 && a>99)||(b<10 && b>99)){
            return false;


        }else {
            int firstdigitA=a/10;
            int laststdigitA=a%10;
            int firststdigitB=b/10;
            int laststdigitB=b%10;
            if ((firstdigitA==firststdigitB)||(laststdigitA==laststdigitB)){
                return true;      //to find out same number from given 2 number
            } else if ((firstdigitA==laststdigitB)||(firststdigitB==laststdigitA)) {
                return true;
            }else {
                return false;
            }
        }
    }
}
