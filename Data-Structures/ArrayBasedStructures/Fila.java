import java.util.NoSuchElementException;

public class Fila {
    Object[] fila;
    int head; int tail;
    int size;

    public Fila(int tamanho){
        this.fila = new Object[tamanho];
        this.head = -1;
        this.tail = -1;
        this.size = 0;
    }

    public boolean addLast(Object elem){
        if (!isFull())
            this.size++;

        if (isEmpty())
            this.head = 0;

        if (isFull())
            this.head = (this.head + 1) % this.fila.length;

        this.tail = (this.tail + 1) % this.fila.length;
        this.fail[tail] = element;
    }

    public boolean removeFirst(){
        if (isEmpty()) throw new NoSuchElementException();

        String value = this.fila[this.head];
        
        if (this.head == this.tail){
            this.head = -1;
            this.tail = -1;
        } else {
            this.head = (this.head + 1) % this.fila.length;
        }

        this.size -= 1;
        return value;
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public boolean isFull(){
        return (this.size >= fila.length);
    }
}
