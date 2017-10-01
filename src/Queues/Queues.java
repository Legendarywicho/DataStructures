package Queues;

/**
 * Created by Luis Santiago on 9/27/17.
 */
public class Queues {

    private Node head;
    private Node tail;


    public Queues() {

    }
    public Boolean isEmpty(){
        return head==null;
    }

    public void add(int data){
        Node node = new Node(data);
        if(tail!=null){
            tail.setNext(node);
        }
        tail = node;
        if(head == null){
            head = node;
        }
    }

    public int peek(){
        if(head!=null){
            return head.getValue();
        }
        // if we don't find anything, return -1;
        return -1;
    }

    public int remove(){
        int data = head.getValue();
        head = head.getNext();
        if(head == null){
            tail = null;
        }
        return data;
    }

    public void printAllElements(){
        Node currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode.getNext());
            // set the other node
            currentNode = currentNode.getNext();
            System.out.println();
        }
    }


}
