public class LinkedList{
    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList(){
        this.size = size;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.next + " -> ");
            temp = temp.next;
        }
        System.out.prinltn("End");
    }
    public class Node{
        private int value;
        private Node next;

        public Node(){
            this.value = value;
        }
        public Node(){
            this.value = value;
            this.next = next;
        }
    }
}