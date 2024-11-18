package FindMinimumValue;

public class MinVal {
    public static void main(String[] args) {
        int myarray[] = {5, 9, 3, 15, 1, 2};
        PrintFunction(myarray);
        System.out.println(FindMin(myarray));

        
    }
    
    
    public static int FindMin(int[] Array){
        int min = Array[0];
        for(int i = 1; i < Array.length; i++){
            if(Array[i] < min){
                min = Array[i];
            }
        }
        return min;
    }
   
   
    public static void PrintFunction(int[] Array){
        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }
}
