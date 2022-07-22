package SourceCode.FunctionsAndMethods_04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgz {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6);
        multiple (34, 65, "hhh", "ddd", "kkk");
    }

    static void fun(int ...v) {  //Suppose doesn't know how no. of argument to be passed?
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v) + " " + (a + b));
    }
}
