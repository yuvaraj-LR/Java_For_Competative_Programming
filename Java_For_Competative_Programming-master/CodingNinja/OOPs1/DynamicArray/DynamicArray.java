package CodingNinja.OOPs1.DynamicArray;

public class DynamicArray {

    private int[] data;
    private int nextElementIndex;

    public DynamicArray() {
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

    public int size() {
        return nextElementIndex;
    }

    public int getIndex(int index) {
        if (index > nextElementIndex) {
            return -1;
        }

        return data[index];
    }

    public void setIndex(int index, int value) {
        data[index] = value;
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    public void addIndex(int index, int value) {
        if (nextElementIndex + 1 >= data.length) {
            doubleTheCapacity();
        }

        if (index > nextElementIndex) {
            return;
        }

        int currentIndex = 0;
        int[] temp = new int[data.length];

        for ( ; currentIndex < index; currentIndex++) {
            temp[currentIndex] = data[currentIndex];
        }

        temp[index] = value;
        for (int i = currentIndex + 1; i < temp.length; i++) {
            temp[i] = data[i - 1];
        }

//        Copying to data
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
        nextElementIndex++;
    }

    public int removeLast() {
        if (nextElementIndex == 0) {
            return -1;
        }

        int temp = data[nextElementIndex - 1];
        data[nextElementIndex - 1] = 0;
        nextElementIndex--;
        return temp;
    }


    public void removeIndex(int index) {
        if (index > nextElementIndex) {
            return;
        }

        int currentIndex = 0;
        int[] temp = new int[data.length - 1];

        for ( ; currentIndex < index; currentIndex++) {
            temp[currentIndex] = data[currentIndex];
        }

        for (int i = currentIndex; i < temp.length; i++) {
            temp[i] = data[i + 1];
        }

//        Copying to data
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }

        nextElementIndex--;
    }

}
