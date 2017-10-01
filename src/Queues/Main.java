package Queues;

/**
 * Created by Luis Santiago on 9/27/17.
 */
public class Main {
    public static void main(String ...args){
        Queues queues = new Queues();
        queues.add(1);
        queues.add(2);
        queues.add(3);
        queues.add(4);
        queues.add(5);
        queues.add(6);
        queues.printAllElements();
        queues.remove();
        queues.printAllElements();
    }
}
