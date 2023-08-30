package SourceCode.StackAndQueue_12.Lecture.CustomStack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int element) throws CustomStackException {
        if (isFull()) {
            int[] temp = new int[(data.length - 1) * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(element);
    }
}
