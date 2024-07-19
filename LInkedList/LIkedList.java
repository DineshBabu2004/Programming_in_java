package LInkedList;

 class LIkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head = null;
    public static  Node tail = null;
    public static int size;
    public void addFirst(int data){
        //creating new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head =tail = newNode;
            return;
        }
        
        //step - 2 
        newNode.next = head;
        //step -3
        head = newNode;

    }
    public void addMiddle(int data,int idx){
        if(head == null){
            return ;
        }
        if(idx ==0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next= newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
             size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public  void removeFirst(){
        if(size == 0)
        return;
        else if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        size--;
        Node temp = head;
         head = temp.next;
         temp.next = null;
    }
    public void removeLast(){
        if(size == 0){
            System.out.println("Empty List");
            return;
        }
        else if (size == 1){
            head = tail = null ;
            size = 0;
            return;
        }
        Node prev = head;
        int i = 1;
        while(i<size-1){
            prev = prev.next;
            i++;
        }
        tail = prev;
        prev.next= null;
        size --;
    }
    public void traverse(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public int search(int val){
        if(size == 0){
            return -1;
        }
        else if(size == 1){
           if( head.data == val)
           return 0;
        }
        Node temp = head;
        int i = 0;
        while(temp.next!=null){
            if(temp.data == val){
                return i;
            }
            temp= temp.next;
            i++;
        }
        return -1;

    }
    public int helper(Node head,int data){
        if(head.next == null){
            return -1;
        }
        if(head.data == data)
        return 0;
        int idx = helper(head.next, data);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    
    public int recuSearch(int data){
        return helper(head, data);
    }
    public void reverse(){
        //using three variables
        Node prev = null;
        Node next =tail = head;
        Node curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void removeNthNodeFromEnd(int n){
        int iPosition = size-n;//find the position from end
        int i = 1;
       Node prev = head;
       if(n==size){
        head = head.next;
       }
        while(i<iPosition){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public Node findMiddle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)//condition for both odd and even numbers
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(){
        if(head == null||head.next==null){
            return true;
        }
        //step -1 : finding midle
        Node mid = findMiddle();
        //sttep -2 : reverse
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //right and left pointer 
        Node right = prev;
        Node left = head;
        //step 3: traverse 
        while(right!=null){
            if(left.data !=right.data)
            return false;
            left = left.next;
            right = right.next;
        }
        return true;

    }
    public static boolean isCyclic(){
        Node slow = head;
        Node fast = head;
        while(  fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
            
        }
        return false;
    }
    public static void removeCyclic(){
        
        Node slow = head;
        Node fast = head;

        // Detect cycle using slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // If there's no cycle, return
        if (fast == null || fast.next == null) {
            return;
        }

        // Find the start of the cycle
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // Remove the cycle
        prev.next = null;

    }
    Node merge(Node leftP , Node rightP){
        // create a dummy node 
        Node mergell = new Node(-1);
        Node temp = mergell;
        while(rightP!=null && leftP!=null){
            if(leftP.data <= rightP.data){
                temp .next = leftP;
                temp = leftP;
                leftP = temp.next;
            }
            else{
                temp .next = rightP;
                temp = rightP;
                rightP = temp.next;
            }
        }
        while (leftP!=null) {
            temp .next = leftP;
            temp = leftP;
            leftP = temp.next;

        }
        while (rightP!=null) {
            temp .next = rightP;
            temp = rightP;
            rightP = temp.next;
        }
        return mergell.next;
    }

    Node mergeSort(Node head){
        if(head!=null || head.next==null){
            return head;
        }
       

        Node mid = midElement2(head);
        Node right = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(right);
      
        return merge(newLeft, newRight);
       

    }

    Node midElement2(Node head){
        Node slow = head ;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow ;

    }
    public static void main(String[] args) {
       //making cycle 
    //    head = new Node(1);
    //    Node temp = new Node(2);
    //    head.next = temp;
    //    head.next.next = new Node(3);
    //    head.next.next.next = new Node(4);
    //    head.next.next.next.next = temp;
    //     // 1--> 2 --> 3 --> 1
    LIkedList l1 = new LIkedList();
    l1.addFirst(1);
    l1.addFirst(2);
    l1.addFirst(3);
    l1.addFirst(4);
    l1.addFirst(5);
    l1.traverse();
   head =  l1.mergeSort(head);
   l1.traverse();

    
        }
}