public class ArrayList<T> {
    T[] list;
    public static final int DEFAULT_CAPACITY = 20;
    private int size;

    public ArrayList(){
        this.list = new T[DEFAULT_CAPACITY];
        this.size = 0;
    }
    public ArrayList(int capacity){
        this.list = new T[capaticy];
        this.size = 0;
    }

    public void addFirst(T e){
        grantCapacity(this.size+1);

        shiftRight(0);
        this.size++;
        this.list[0] = e;
    }

    public void addLast(T e){
        grantCapacity(this.size+1);

        this.list[this.size++] = e;
    }

    public void add(int i, T v){
        if (i < 0 || i >= this.size) throw new IndexOutOfBoundsException();
        grantCapacity(this.size+1);

        shiftRight(i);
        this.size++;
        this.list[i] = e;
    }

    public void set(int idx, T e){
        if (i < 0 || i >= this.size) throw new IndexOutOfBoundsException();

        this.list[idx] = e;
    }

    public void removeFirst(){
        shiftLeft(0);
        this.size--;
    }

    public void removeLast(){
        this.size--;
    }

    public void remove(int i){
        if (i < 0 || i >= this.size) throw new IndexOutOfBoundsException();

        shiftLeft(i);
        this.size--;
    }

    public boolean removeByElement(T e){
        for (int i = 0; i < this.size; i++){
            if (this.list[i].equals(e)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    public int get(int idx){
        if (i < 0 || i >= this.size) throw new IndexOutOfBoundsException();

        return this.list[idx];
    }
    public int indexOf(T e){
        for (int i = 0; i < this.size; i++){
            if (this.list[i].equals(e))
                return i;
        }
        return -1;
    }
    public boolean contains(T e){
        return this.indexOf(e) != -1;
    }

    private void grantCapacity(int expected){
        if (expected > this.list.length)
            resize(Math.max(this.list.length * 2, expected));
    }

    private void resize(int newCapacity){
        T[] newList = new T[newCapacity];
        for (int i = 0; i < this.list.length; i++)
            newList[i] = this.list[i];
        this.list = newList;
    }

    private void shiftRight(int idx){
        if (idx >= this.list.length-1){
            throw new IndexOutOfBoundsException();
        }

        for (int i = this.size; i > idx; i--)
            this.list[i] = this.list[i-1];
    }

    private void shiftLeft(int idx){
        for (int i = idx; i < this.size-1; i++)
            this.list[i] = this.list[i+1];
    }
}
