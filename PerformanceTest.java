public class PerformanceTest {

    public static void main(String[] args) {

        System.out.println("Performance Test Started...");

        long startTime = System.currentTimeMillis();

        // Simulate some workload
        for (int i = 1; i <= 1000000; i++) {
            String value = "TestData_" + i;
            value.toUpperCase();
        }

        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        System.out.println("Performance Test Completed.");
        System.out.println("Execution Time: " + executionTime + " ms");
    }
}