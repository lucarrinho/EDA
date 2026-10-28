import java.util.*;

public class main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TrimLinkedList link = new TrimLinkedList();

        String[] ent = sc.nextLine().split(" ");
        for (int i = 0; i < ent.length; i++)
             link.addLast(Integer.parseInt(ent[i]));

        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            link.removeFirst();
            link.removeLast();
            System.out.println(link.toString());
        }
    }
}

class TrimLinkedList {
    Node head;
    Node tail;
    int size;

    public TrimLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return this.head == null;
    }

    public void addLast(int val){
        Node newNode = new Node(val);
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.size++;
    }
    public void removeLast(){
        Node aux = this.tail;
        this.tail = aux.prev;
        this.tail.next = null;
        this.size--;
        if (this.size == 0){
            this.head = null;
            this.tail = null;
        }
    }
    public void removeFirst(){
        Node aux = this.head;
        this.head = aux.next;
        this.head.prev = null;
        this.size--;
        if (this.size == 0){
            this.head = null;
            this.tail = null;
        }
    }

    public String toString(){
        if (isEmpty())
            return "vazia";
        String ans = "" + this.head.value;
        Node aux = this.head;
        while (aux.next != null){
            aux = aux.next;
            ans += " " + aux.value;
        }
        return ans;
    }
}

class Node {
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}