public class GenericStack<T extends Comparable<T>> {
    T [] items;
    int top;

    public GenericStack(Class<T> datatype, int size){
        this.top = -1;
        items = (T[])java.lang.reflect.Array.newInstance(datatype, size);
    }

    public void push(T val){
        if (isFull()){
            System.out.println("Stack is full");
        }else {
            this.items[++this.top]=val;
        }
    }
    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return items[0];
        }
        else {
            this.top--;
            return this.items[this.top+1];
        }
    }
    public boolean isEmpty(){
        return this.top ==-1;
    }
    public boolean isFull(){
        return this.top == this.items.length-1;
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(this.items[i]);
            }
        }
    }
}
