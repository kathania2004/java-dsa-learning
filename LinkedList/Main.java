class LinkedList{
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

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1;i < index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteAtFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = head;
        }
        size--;
        return val;

    }

    public int deleteLast(){
        if(size <= 1){
            return deleteAtFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteAtPos(int index){
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
        
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0;i < index;i++){
            node = node.next;
        }
        return node;
    }
    public Node findNode(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }else{
                node = node.next;
            }
        }
        return null;
    }



    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }
}
class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insertAt(44,4);
        list.display();
        //System.out.println(list.deleteAtFirst());
        //System.out.println(list.deleteLast());
        //System.out.println(list.deleteAtPos(3));
        list.display();
        System.out.println(list.findNode(44));

    }
}