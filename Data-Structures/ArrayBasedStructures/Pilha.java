public class Pilha {
    Object[] stack;
    private int tail;
    int size;

    public Pilha(int capacidade){
        this.stack = new Object[capacidade];
        this.tail = -1;
        this.size = 0;
    }

    public boolean addLast(Object elem){
        if (isFull()) // resize?

        this.size++;
        this.stack[this.tail++] = elem;
    }

    public Object removeLast(){
        if (isEmpty()) // erro, sla

        this.size--;
        return this.stack[--this.tail];
    }

    private boolean isEmpty(){
        return (this.size == 0);
    }

    private boolean isFull(){
        return (this.size >= this.stack.length);
    }
}
