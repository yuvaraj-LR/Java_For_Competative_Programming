package CodingNinja.Maps.Lectures;

public class MapUse {
    public static void main(String[] args) {

        Map<String, Integer> map = new Map<>();

        for (int i = 0; i < 40; i++) {
            map.insert("abc"+i, i+1);
            System.out.println(i + map.loadFactor());
        }

        map.delete("abc2");
        map.delete("abc7");

        for (int i = 0; i < 40; i++) {
            System.out.println("abc " + i + ": " + map.get("abc" + i));
        }
    }
}
