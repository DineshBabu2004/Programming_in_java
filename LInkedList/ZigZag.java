package LInkedList;

public class ZigZag {

    // Node class to represent each element in the linked list
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class to manage the linked list
    static class LinkedList {
        Node head;
        Node tail;

        // Add element at the beginning of the linked list
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        // Traverse and print the linked list
        public void traverse() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Find the middle element of the linked list
    public static Node midElement(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Reverse the second half of the linked list
    public static Node reverse(Node mid) {
        Node prev = null;
        Node next;
        Node curr = mid.next;
        mid.next = null; // break the list
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Zigzag rearrange the linked list
    public static void zigZag(Node head) {
        if (head == null || head.next == null) return;

        Node mid = midElement(head);
        Node right = reverse(mid);
        Node left = head;

        while (right != null && left != null) {
            Node leftNext = left.next;
            Node rightNext = right.next;

            left.next = right;
            if (leftNext == null) break;
            right.next = leftNext;

            left = leftNext;
            right = rightNext;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addFirst(0);

        System.out.println("Original List:");
        l1.traverse();

        zigZag(l1.head);

        System.out.println("ZigZag List:");
        l1.traverse();
    }
}
