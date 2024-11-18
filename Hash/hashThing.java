//import java.util.*;;

import java.util.Hashtable;

public class hashThing {

    public static void main(String[] args) {
        final int SIZE = 10;
        Hashtable<Integer, String> MyTable = new Hashtable<>(SIZE); //capicity, load factor(optional)

        MyTable.put(100, "Peeraphat");
        MyTable.put(555, "Pongsakon");
        MyTable.put(123, "Phakkhapon");
        MyTable.put(3242,"Surawit");

        MyTable.remove(555);

        for(Integer key : MyTable.keySet()){
            System.out.println( key.hashCode()%10 + "\t" + key + "\t" + MyTable.get(key));
        }

        System.out.println(MyTable.get(100));
    }
}

