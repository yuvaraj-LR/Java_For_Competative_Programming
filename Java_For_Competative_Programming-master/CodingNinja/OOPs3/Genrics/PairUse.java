package CodingNinja.OOPs3.Genrics;

public class PairUse {
    public static <innerPair> void main(String[] args) {
//        Pair pInt = new Pair(10, 20);
//        Pair pString = new Pair("aa", "bb");
//        Pair pDouble = new Pair(7.8, 2.2);
//        Pair pInteger = new Pair(Integer.valueOf(15), Integer.valueOf(20));

//        System.out.println(pString.getP1() + " " + pInt.getP2() + " " + pInteger.getP2());

//        We must need to mention the data type which should we are going to pass in the trianglular brackets.

//        <> - should contains only Wrapper Class, Arrays, Strings or Other base or derived Classes name.
//        Pair<Integer> pInt = new Pair<Integer>(80, 22);
//        Pair<String> pString = new Pair<>("aa", "bb");

        Pair<Integer, String> innerPair = new Pair<>();

        Pair<innerPair, String> pair = new Pair<innerPair, String>();

    }
}
