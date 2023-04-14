public class LengthAndWidth {
    public static void main(String[] args) {
        System.out.println(categorizeBox(2909,
                3968,
                3272,
                727));
    }

    public static String categorizeBox(int length, int width, int height, int mass) {
        long dimension = (long) length * width * height;
        boolean bulky = false;
        boolean heavy = false;


        if (length >= 10000 || width >= 10000 || height >= 10000 || dimension >= 1000000000) {
            bulky = true;
        }

        if (mass >= 100) {
            heavy = true;
        }

        if (bulky == true && heavy == true) {
            return "Both";
        } else if (bulky == true && heavy == false){
            return "Bulky";
        } else if (bulky == false && heavy == true){
            return "Heavy";
        } else {
            return "Neither";
        }

    }
}

