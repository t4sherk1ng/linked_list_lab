import java.util.Iterator;

class Stack<T> implements Iterable<T> {
    private Node<T>[] array;
    private int top;
    private int size;

    public Stack() {
        this.size = 10;
        this.array = new Node[size];
        this.top = -1;
    }

    public void push(T data) {
        if (top == size - 1) {
            resizeArray();
        }
        Node<T> newNode = new Node<>(data);
        if (top >= 0) {
            array[top].next = newNode;
            newNode.prev = array[top];
        }
        array[++top] = newNode;
    }

    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        Node<T> poppedNode = array[top];
        if (top > 0) {
            array[top - 1].next = null;
        }
        array[top--] = null;
        return poppedNode.data;
    }

    public T peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top].data;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void resizeArray() {
        size *= 2;
        Node<T>[] newArray = new Node[size];
        System.arraycopy(array, 0, newArray, 0, top + 1);
        array = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        private int currentIndex = top;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public T next() {
            return array[currentIndex--].data;
        }
    }
}
