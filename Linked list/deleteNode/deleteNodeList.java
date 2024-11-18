package deleteNode;

import java.util.List;

//import InsertNodeAtAny.InsertNodeAtAny;


public class deleteNodeList {

    private ListNode head;

    public static void main(String[] args) {
        deleteNodeList NewList = new deleteNodeList();
        NewList.head = new ListNode(1000);
        ListNode second = new ListNode(2000);
        ListNode third = new ListNode(3000);
        ListNode fourth = new ListNode(4000);

        NewList.head.next = second;
        second.next = third;
        third.next = fourth;

        NewList.display();
        NewList.delete(2);
        NewList.display();
        //NewList.InsertNodeAtAny.display(); there's a bug
        }
    
    private static class ListNode{
            private int data;
            public ListNode next;

            public ListNode(int data){
                this.data = data;
                this.next = null;
            }
    }


    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    public void delete(int position){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(position == 1){
            deleteFirst();
            return;
        }
        int count = 1;
        ListNode current = head;
        while (count < position - 1 && current != null) {
            current = current.next;
            count++;
        }
       if(current == null || current.next == null){
        System.out.println("position out of bounds");
        return;
       }
       ListNode nodeToDelete = current.next;
       current.next = nodeToDelete.next;
       nodeToDelete.next = null;
    }
}