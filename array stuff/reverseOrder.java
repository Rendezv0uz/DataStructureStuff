public class reverseOrder{
    
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void reverseArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n /2 ; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
    public static void main(String[] args) {
        int myArray[] = {2, 11, 5, 10, 7, 8};
        printArray(myArray);

        reverseArray(myArray);
        printArray(myArray);
    }
}