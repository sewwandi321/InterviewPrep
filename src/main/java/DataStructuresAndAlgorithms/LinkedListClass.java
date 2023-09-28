package DataStructuresAndAlgorithms;


public class LinkedListClass {
     Node head ;
    class Node{
        String data;
        Node next;


        public Node(String data) {
            this.data = data;
            this.next = null;
        }
        public void displayLink(){
            System.out.println(data);
        }
    }

    //add - first ,last
    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next;
        }
        currnode.next = newNode;

    }
    public void addInMiddle(Node prev_node, String data){
        if(prev_node == null){
            System.out.println("the given previous node cannot be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;


    }
    //delete first
    public void deleteFirst(){
        if(head ==null){
            System.out.println("empty");
            return;
        }
        head = head.next;
    }
    public void deletelast(){
        if(head ==null){
            System.out.println("empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;


    }
    //print
    public void printList(){
        if (head == null){
            System.out.println("empty");
            return;
        }
        Node currnode = head;
        while(currnode != null){
            System.out.println(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args){
        LinkedListClass list = new LinkedListClass();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        list.addInMiddle(list.head.next,"not");
        list.printList();
       // System.out.println("print list" + list.toString());

        list.deleteFirst();
        list.printList();
        list.deletelast();
        list.printList();


    }
}
