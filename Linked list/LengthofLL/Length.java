package LengthofLL;

public class Length {

    public static void main(String[] args) {
        Length sll = new Length();
        sll.Head = new ListNode(123);
        ListNode second = new ListNode(456);
        ListNode third = new ListNode(789);
        ListNode fourth = new ListNode(101112);

        sll.Head.next = second;
        second.next = third;
        third.next = fourth;
        System.out.println(sll.LengthCount());
        }

     private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private ListNode Head;


    public int LengthCount(){
        int count = 0;
        ListNode current = Head;
        while (current != null) {
            count ++;
            current =current.next;
        }
        return count;
    }
    



}
