import java.util.Iterator;
public class DoublyLinkedList<T> implements Iterable<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new DoublyLinkedListIterator();
    }

    private class DoublyLinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("Does not has next");
            }
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = data;
    }
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;

    }
    public void addBefore(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else if (head == tail) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail = head.next;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }


    public void remove(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
        throw new IllegalArgumentException("Element " + data + " not found in the list.");
    }

    public void removeHead() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeTail() {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
    }


    public void edit(T oldData, T newData) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(oldData)) {
                current.data = newData;
                return;
            }
            current = current.next;
        }
        throw new IllegalArgumentException("Element " + oldData + " not found in the list.");
    }


    public void print() {
        Node<T> current = head;
        if (size == 0) {
            System.out.println("Empty list");
        }
        for (T element : this) {
            System.out.println(element);
        }
    }

    public int size() {
        return size;
    }
}

