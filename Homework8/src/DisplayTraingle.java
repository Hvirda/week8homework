public class DisplayTraingle {
    /*
    8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
     */
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
/*
for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");

        }
 */