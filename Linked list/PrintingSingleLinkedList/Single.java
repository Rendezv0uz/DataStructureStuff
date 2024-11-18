package PrintingSingleLinkedList;

public class Single {

    

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private ListNode MyHead;

    public void display(){
        ListNode current = MyHead;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Single MySLL = new Single();
        MySLL.MyHead = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(50);

        MySLL.MyHead.next = second;
        second.next = third;
        third.next = fourth;
        
        MySLL.display();
    }
}
