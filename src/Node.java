public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public void setPrev(Node<T> prev){
        this.prev = prev;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public Node<T> getPrev(){
        return this.prev;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}
