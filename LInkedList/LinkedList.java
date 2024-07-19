package LInkedList;


public class LinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node merge(Node leftP, Node rightP) {
        // Create a dummy node
        Node mergedList = new Node(-1);
        Node temp = mergedList;
        while (leftP != null && rightP != null) {
            if (leftP.data <= rightP.data) {
                temp.next = leftP;
                temp = leftP;
                leftP = leftP.next;
            } else {
                temp.next = rightP;
                temp = rightP;
                rightP = rightP.next;
            }
        }
        while (leftP != null) {
            temp.next = leftP;
            temp = leftP;
            leftP = leftP.next;
        }
        while (rightP != null) {
            temp.next = rightP;
            temp = rightP;
            rightP = rightP.next;
        }
        return mergedList.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = midElement(head);
        Node right = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(right);
        return merge(newLeft, newRight);
    }

    public Node midElement(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);
        l1.traverse();
        l1.head = l1.mergeSort(l1.head);
        l1.traverse();
    }
}
