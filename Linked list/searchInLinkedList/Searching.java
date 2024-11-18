package searchInLinkedList;

public class Searching {
    private ListNode Head;

    public static void main(String[] args) {
        Searching sll = new Searching();
        sll.Head = new ListNode(100);
        ListNode second = new ListNode(200);
        ListNode third = new ListNode(300);
        ListNode fourth = new ListNode(400);

        //connect together to form a chain
        sll.Head.next = second; // 100 --> 200
        second.next = third; // 100 --> 200 --> 300
        third.next = fourth; // 100 --> 200 --> 300 --> 400 --> Null
        sll.display();
        System.out.println(sll.Search(100234));

        
}

    public void display(){
    ListNode current = Head;
    while(current != null){
        System.out.print(current.data + " --> ");
        current = current.next;
    }
    System.out.println("null");
}

    private static class ListNode{

    private int data;
    private ListNode next;
    
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

   public boolean Search(int searchKey){
    ListNode current = Head;
    while (current != null) {
        if(current.data == searchKey ){
            return true;
        }
        current = current.next;
    }
    return false;
   }
    
}
