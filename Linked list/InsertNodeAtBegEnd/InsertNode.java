package InsertNodeAtBegEnd;

//import PrintingSingleLinkedList.*;;

public class InsertNode {

    public static void main(String[] args) {
        InsertNode NewSing = new InsertNode();
        NewSing.head = new ListNode(1000);
        ListNode second = new ListNode(20000);
        ListNode third = new ListNode(30000);
        ListNode fourth = new ListNode(40000);

        NewSing.head.next = second;
        second.next = third;
        third.next = fourth;
        NewSing.InsertFirst(111111);
        NewSing.InsertFirst(888);
        NewSing.InsertLast(55555);
        NewSing.display();
    }

    private static class ListNode{
        private int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }


    private ListNode head;

        public void InsertFirst(int value){ //inserting at the beginning
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
        }

        public void InsertLast(int value){ //inserting at the ending
            ListNode NewNode_1 = new ListNode(value);
            if(head == null){
                head = NewNode_1;
                return;
            }
            ListNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = NewNode_1;
        }

        public void display(){
            ListNode current = head;
            while(current != null){
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println("null");
        }
    
}