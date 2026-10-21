public class LinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addFirst(T elem){
    }
    public void addLast(T elem){
    }
    public void add(int index, T elem){
    }

    public void removeFirst(){
    }
    public void removeLast(){
    }
    public void remove(int i){
    }
    public void removeByElement(T elem)
}

class Node<T> {
    public Node next;
    public Node prev;

    public Node(){
        this.next = null;
        this.prev = null;
    }
}
