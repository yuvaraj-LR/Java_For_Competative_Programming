package SourceCode.OOPs_08.OOP_1;

public class FinalizeKeyword {
    public static void main(String[] args) {
        Test test;
        for (int i = 0; i < 1000000000; i++) {
            test = new Test(5);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object has destroyed!!!");
    }
}

class Test {
    int m1;
    int m2;

    Test(int m1) {
        this.m1 = m1;
    }
}
