package LinkedList;

/**
 * Created by Luis Santiago on 9/27/17.
 */
public class Main {
    public static void main(String ...args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertElement(5);
        linkedList.insertElement(6);
        linkedList.insertElement(7);
        linkedList.insertElement(8);
        linkedList.insertElement(9);
        linkedList.insertElement(10);

        linkedList.removeFirstNode();
        linkedList.displayAllNode();

        System.out.println(linkedList.findCertainElement(8).getValue()+" Was found");
        linkedList.removeNode(8);
        linkedList.displayAllNode();
    }
}
