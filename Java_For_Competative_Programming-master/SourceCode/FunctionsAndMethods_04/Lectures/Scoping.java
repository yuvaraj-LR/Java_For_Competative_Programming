package SourceCode.FunctionsAndMethods_04;

public class Scoping {
    static int ans = 20;
    public static void main(String[] args) {
        int a = 15;
        int b = 30;
        int sum = a + b;

        System.out.println(sum); // This sum only available in this method.
        //MethodScope(sum);
        System.out.println(sum);
        //System.out.println(add); // This add cannot be called because add scope is in MethodScope only.
        //BlockScope(a);
        Shadowing();
    }

    static void MethodScope(int add) {
        int a = 12;
        System.out.println(a+add); // Because a doesn't initilized in this block.
    }

    static void BlockScope(int num) {
        int num1 = 70;
        {
            num += (num + num1);
            System.out.println(num);
            if (num1 <= num) {
                String success = "yes";
            }
            //System.out.println(success); //Bcoz it doesn't initilized in this block.
        }
        System.out.println(num + " " + num1);
    }

    static void LoopScope() {
        int num = 5;
        for (int i = 0; i < num; i++) {
            int a = 10;
        }
       // System.out.println(a); //Bcoz it doesn't initilized in this block.
    }

    static void Shadowing() {
        System.out.println(ans);// ans was printed bcoz it was initilized within this block.
        if (7 == 7){
            ans += 2;
            System.out.println(ans);
        }
        int ans = 90;
        System.out.println(ans);
    }
}
