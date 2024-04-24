import java.util.LinkedList;
import java.util.Objects;

public class Custom<T> {
    private Node head;
    private Node last;
    int size = 0;
    private class Node{
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;

        }
    }
    public void add(T element){
        if (Objects.isNull(head)){
            head = new Node(element);
            last = head;
            size++;
            return;
        }
        last.next = new Node(element);
        last = last.next;
        size++;
    }
    public T get(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public void remove(int index){
        if (index == 0){
            head = head.next;
        }
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp.next = temp.next.next;
            return;
        }
    }
    public boolean contains(T element){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(temp.value, element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


}