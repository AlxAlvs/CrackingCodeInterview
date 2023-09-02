import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public static void removeDuplicates(LinkedListNode<Integer> input) {
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode<Integer> previous = null;
        while (input != null) {
            if(set.contains(input.data)){
                previous.next = input.next;
            } else {
                set.add(input.data);
                previous = input;
            }
            input = input.next;
        }
    }

}