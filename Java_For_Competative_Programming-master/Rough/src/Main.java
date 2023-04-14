public class Main {
    public static void main(String[] args) {
        pattern3(3);
    }

    public static void pattern3(int n) {
        for (int row=n; row>=0; row--) {
            int noSpc = n - row;
            for (int spc=0; spc<=noSpc; spc++) {
                System.out.print(" ");
            }
            for (int col=0; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row=1; row<=n; row++) {
            int spc = n - row;
            for (int noSpc=0; noSpc<spc; noSpc++) {
                System.out.print("   ");
            }

            for (int col=1; col<=row; col++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void pattern1(int n) {
        for (int i=0; i<=n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}