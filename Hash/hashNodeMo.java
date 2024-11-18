import java.util.Hashtable;

public class hashNodeMo {

    private HashNode[] buckets;//an HashNode array type called buckets
    private int numOfBuckets; //capacity
    private int size; //number of key value pairs in hash table or number of hash nodes

    public hashNodeMo(){
        this(10); //defaulr capacity
    }
    
    public hashNodeMo(int capacity){
        this.numOfBuckets = capacity;
        buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    private class HashNode{
        private Integer key;
        private String value; 
        private HashNode next;

        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0; //if size is 0 return true, uf not return false
    }

    public void put(Integer key, String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("key or value is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value); //(key,value) ->null
        node.next = head;
        buckets[bucketIndex] = node;
    }

    private int getBucketIndex(Integer key){
        return key%numOfBuckets; //bucketlength(capacity)
    }

    public String get(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode prev = null;
        while (head != null) {
            if(head.key.equals(key)){
                if(prev == null){
                    buckets[bucketIndex] = head.next; //update bucket head
                }
                else{
                    prev.next = head.next;
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
            
        }
        return null;
    }
    public static void main(String[] args) {
       hashNodeMo MyTable = new hashNodeMo(10);
        MyTable.put(21, "green");
        MyTable.put(35, "black");
        MyTable.put(45, "white");
        MyTable.put(45, "yellow");
        MyTable.put(55, "blue");
        MyTable.put(65, "grey");
        System.out.println("Size : " + MyTable.size());
        System.out.println(MyTable.isEmpty());
        System.out.println(MyTable.get(21));
        System.out.println(MyTable.remove(45));
        System.out.println("Size : " + MyTable.size());
    }
}
