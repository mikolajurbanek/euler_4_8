package queue;

import java.util.Arrays;

public class Queue {

    Node[] queue = new Node[0];
    Node head = new Node("head");

    public Queue() {

    }

    public void enqueue(String value) {
        if(queue.length==0){
            queue = new Node[1];
            head = new Node(value);
            queue[0] = head;
        }
        else {
            Node[] temp = queue;
            queue = new Node[queue.length+1];
            for(int i =0; i< temp.length; i++) {
                queue[i] = temp[i];
            }
            queue[queue.length-1] = new Node(value);
            queue[queue.length-2].setNextNode(queue[queue.length-1]);
        }
        System.out.println("Node added to queue: " + value);
    }

    public String peek() {
        Node n = new Node("temp");
        if(queue.length!=0){
        for (Node node: queue) {
            if (node == head) {
                n = node;
                System.out.println(n.getValue());
            }
        }

        } return n.getValue();
    }

    public String dequeue() {
        if(queue.length!=0) {
            Node[] newQueue = new Node[queue.length - 1];
            for (int i = 0; i < newQueue.length; i++) {
                newQueue[i] = queue[i + 1];
            }
            queue = newQueue;
        } return "d";
    }

    public void toPrint() {

        for (int i =0; i<queue.length; i++){
            System.out.print(i);
            System.out.println(queue[i].getValue());
        }
       }


}
