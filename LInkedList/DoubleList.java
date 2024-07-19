package LInkedList;

public class DoubleList {
   static  class Node {
        Node prev;
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null; 
        }
    }
    public static Node head = null;
    public static Node tail = null;
    public void addFirtst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void reverse(){
        Node curr =  head;
        Node prev =null;
        Node curr;
    }
    public static void main(String[] args) {
    DoubleList dll =  new DoubleList();
    dll.addFirtst(1);
    dll.addFirtst(2);
    dll.addFirtst(3);
    dll.addFirtst(5);
    dll.print();
    System.out.println();
    dll.addLast(7);
    dll.print();
    dll.addLast(8);
    System.out.println();
    dll.print();
    }
}
