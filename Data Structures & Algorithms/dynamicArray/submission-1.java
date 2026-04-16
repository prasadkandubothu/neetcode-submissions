class DynamicArray {
    Integer[] arr=null;
    int cap=0;
    int size=0;
    public DynamicArray(int capacity) {
        if(capacity <= 0){
            throw new RuntimeException();
        }
        this.arr=new Integer[capacity];
        this.cap=capacity;
        this.size=0;
        
    }

    public int get(int i) {
                if (i < 0 || i >= size) throw new IndexOutOfBoundsException();

        return arr[i];
    }

    public void set(int i, int n) {
                if (i < 0 || i >= size) throw new IndexOutOfBoundsException();

        arr[i]=n;
    }

    public void pushback(int n) {
        if(cap == size)
            resize();

        arr[size]=n;
        size++;
    }

    public int popback() {
                if (size == 0) throw new IndexOutOfBoundsException();

        int el=arr[size - 1];
        //arr[arr.length]
        size--;
        return el;
    }

    private void resize() {
        this.cap =2 * cap;
            Integer[] a1=new Integer[this.cap];
            for ( int i=0; i < size; i++){
                a1[i]=arr[i];
            }
            arr=a1;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return cap;
    }
}
