package CodingNinja.Test5;

public class PredictOutput {

    public static void main (String[] args) {
        C c = new C();
    }
}

class A{
    A(){
        System.out.print("first ");
    }
}
class B extends A{
    B(){
        System.out.print("second ");
    }
}
class C extends B{
    C(){
        System.out.print("third ");
    }
}