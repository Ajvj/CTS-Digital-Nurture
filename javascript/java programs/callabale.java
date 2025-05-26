import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        // 1. Create a thread pool with 3 worker threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 2. Create a list to hold Future objects (results)
        List<Future<String>> results = new ArrayList<>();

        // 3. Submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            Callable<String> task = () -> {
                Thread.sleep(1000); // Simulate time-consuming task
                return "Task " + taskId + " completed by " + Thread.currentThread().getName();
            };
            Future<String> future = executor.submit(task);
            results.add(future);
        }

        // 4. Retrieve results
        for (Future<String> result : results) {
            System.out.println(result.get()); // Blocks until result is ready
        }

        // 5. Shutdown executor service
        executor.shutdown();
    }
}
