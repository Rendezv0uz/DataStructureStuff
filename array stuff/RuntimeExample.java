public class RuntimeExample {
    public static void main(String[] args) {
        // Start time
        long startTime = System.nanoTime();
        
        // Code to measure
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        // End time
        long endTime = System.nanoTime();
        
        // Calculate elapsed time in nanoseconds
        long duration = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + duration);

        // Optionally, convert to milliseconds
        System.out.println("Execution time in milliseconds: " + (duration / 1_000_000));
    }
}
