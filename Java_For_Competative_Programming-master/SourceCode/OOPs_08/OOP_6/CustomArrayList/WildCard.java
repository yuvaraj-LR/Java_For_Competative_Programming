package SourceCode.OOPs_08.OOP_6.CustomArrayList;

import java.util.List;

// This mean that the T can be either Integer or Sub classes of
// of Integer.
public class WildCard <T extends Number> {

//     ? - Same as the previous one, we can use it in number class.

    public void getList(List<? extends Number> list) {
//        Some functions
    }
}
