public class AlsoRuntimeExample {
    public static void main(String[] args) {
        // Start time
        long startTime = System.currentTimeMillis();
        
        // Code to measure
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        // End time
        long endTime = System.currentTimeMillis();
        
        // Calculate elapsed time in milliseconds
        long duration = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + duration);
    }
}
