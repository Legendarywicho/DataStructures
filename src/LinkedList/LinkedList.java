package LinkedList;

/**
 * Created by Luis Santiago on 9/26/17.
 */
public class LinkedList {

    private Node head;

    public LinkedList(){
        head = null;
    }
    public void insertElement(int value){
        //We check if we have the head empty, otherwise we have elements
        if(head == null){
            head = new Node(value);
            return;
        }
        else{
            // we have to remove the first node currently and store it before the new one.
            Node temp = head;
            Node newNode = new Node(value);
            newNode.setNext(temp);
            head = newNode;
        }
    }
    public Node removeFirstNode(){
        // we get the head.next element and store it as the first one
        Node currentNode = head;
        if(!isEmpty()){
            head = head.getNext();
        }
        else{
            System.out.println("Empty LinkedList");
        }

        return currentNode;
    }

    public void displayAllNode(){
        Node currentNode = head;
        while(currentNode!=null){
            currentNode.displayNode();
            System.out.println("Next link: " + currentNode.getNext());
            currentNode = currentNode.getNext();
            System.out.println();
        }
    }

    public Node findCertainElement(int value){
        Node current = head;
        if(!isEmpty()){
            while(current.getValue()!=value){
                if(current.getValue() == null){
                    return null;
                }else{
                    current = current.getNext();
                }
            }
        }else{
            System.out.println("Empty linked list");
        }

        return current;
    }

    public Node removeNode(int value){
        Node currentNode = head;
        Node previousNode = head;
        if(!isEmpty()){
            while(currentNode.getValue()!= value){
                if(currentNode.getValue() == null){
                    return null;
                }
                else{
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                }
            }
            if(currentNode == head){
                head = head.getNext();

            }else{
                previousNode.setNext(currentNode.getNext());
            }
        }

        return currentNode;
    }

    private Boolean isEmpty(){
        return head == null;
    }
}
