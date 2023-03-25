//This means OOPs_08 has a folder called OOP_2 and there OOP_2 folder has a package of a.
package SourceCode.OOPs_08.OOP_2.Packages.a;

//Here, we are going to importing the message() method from the Message class which in the b package.
import static SourceCode.OOPs_08.OOP_2.Packages.a.b.Message.message;

public class PackageInfo {
    public static void main(String[] args) {
        System.out.println("Package Information");
        message();
    }
}
