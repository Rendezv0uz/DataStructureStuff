package InsertNodeAtAny;

public class InsertNodeAtAny {
    public static void main(String[] args) {
        InsertNodeAtAny NewSing = new InsertNodeAtAny();
        NewSing.head = new ListNode(1000);
        ListNode second = new ListNode(20000);
        ListNode third = new ListNode(30000);
        ListNode fourth = new ListNode(40000);

        NewSing.head.next = second;
        second.next = third;
        third.next = fourth;
        
        NewSing.display();

        NewSing.Insert(1, 555);
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

    

        public void Insert(int position, int value){
            //1 --> 4 --> 5  + (3, 6)
            //1 --> 4 --> 6 --> 5
            ListNode node = new ListNode(value);

            if(position == 1){
                node.next = head;
                head = node;
            }
            else {
                ListNode previous = head;
                int count = 1; //position

                while (count < position - 1) {
                    previous = previous.next;
                    count++;
                    
                }
                ListNode current = previous.next;
                previous.next = node;
                node.next = current ;
               
            }
        }
     
        public static void displayStatic(ListNode start) {
            ListNode current = start;
            while(current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println("null");
        }//static

        public void display(){
            ListNode current = head;
            while(current != null){
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println("null");
        }
}
