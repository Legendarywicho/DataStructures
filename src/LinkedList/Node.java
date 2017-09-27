package LinkedList;

/**
 * Created by Luis Santiago on 9/26/17.
 */
public class Node {
    private Integer value;
    private Node next;

    public Node(Integer value) {
        this.value = value;
        this.next = next;
    }

    public void displayNode(){
        System.out.println("THE VALUE OF THE NODE IS : "+ value);
    }

    public Integer getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString(){
      return value.toString();
    }
}
