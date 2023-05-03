import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        int basicSalary = sc.nextInt();
        String gra = sc.next();
        char grade = gra.charAt(0);

        double hra = ((double) 20 /100) * basicSalary;
        double da = ((double) 50 /100) * basicSalary;
        double pf = ((double) 11 /100) * basicSalary;

        int allow = 0;

        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double totalsal = (basicSalary + hra + da + allow - pf);
        int totalSal = (int) Math.round(totalsal);

        System.out.println(totalSal);

    }
    public static void test() {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int basicSalary = sc.nextInt();
        String gra = sc.next();
        char grade = gra.charAt(0);

        double hra = 0.20 * basicSalary;
        double da = 0.50 * basicSalary;
        int allow = 0;

        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double pf = 0.11 * basicSalary;

        double totalSalary = (basicSalary + hra + da + allow - pf);
        int total = (int)(Math.ceil(totalSalary));

        System.out.println(total);

    }
}
