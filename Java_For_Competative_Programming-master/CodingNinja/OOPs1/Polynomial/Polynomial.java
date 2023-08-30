package CodingNinja.OOPs1.Polynomial;

public class Polynomial {

    private int[] data;
    private int nextElementIndex;
    private int coefficient;
    private int power;

    public Polynomial() {
        data = new int[5];
        nextElementIndex = 0;
    }

    public void add(int value) {
        if (nextElementIndex == data.length) {
            doubleTheCapacity();
        }
        data[nextElementIndex++] = value;
    }

    private void doubleTheCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];

        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }
}
