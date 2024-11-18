package SinglyLinkedList;

public class Singly{
    
    private ListNode Head;

    private static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Singly sll = new Singly();
        sll.Head = new ListNode(100);
        ListNode second = new ListNode(200);
        ListNode third = new ListNode(300);
        ListNode fourth = new ListNode(400);

        //connect together to form a chain
        sll.Head.next = second; // 100 --> 200
        second.next = third; // 100 --> 200 --> 300
        third.next = fourth; // 100 --> 200 --> 300 --> 400 --> Null
    }







}