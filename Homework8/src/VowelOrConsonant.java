import java.util.Scanner;

public class VowelOrConsonant {
    /*
    3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
     */
    public static void main(String[] args) {
        isVowelOrConsonant();
    }

    public static void isVowelOrConsonant() {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter letter");
            CharSequence c=sc.next();          //chartreuse readable sequence of char value

            String s1="A,E,I,O,U,a,e,i,o,u";
            String s2="B,C,D,F,G,H,J,K,L,M,N,P,Q,R,S,T,V,X,Y,Z,b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z";


            if (s1.contains(c)) {                        //check input value is present in s1 string
                System.out.println("Input letter is vowel");
            }else if (s2.contains(c)){                   //check input value is present in s1 string
                System.out.println("Input letter is consonant");
            }else if (c.length()>1){                     //check length of input value if >1 print error
                System.out.println("Input is not a letter");
            }else {
                System.out.println("Not a letter");
            }



    }
}
