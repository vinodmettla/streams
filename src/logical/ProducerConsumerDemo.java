package logical;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerDemo {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int value = queue.take();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Finished execution");
    }
}

//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.ArrayBlockingQueue;
//
//public class ProducerConsumerDemo {
//
//    public static void main(String[] args) {
//
//        // Buffer size = 5
//        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
//
//        // Producer Thread
//        Thread producer = new Thread(() -> {
//            int value = 1;
//            try {
//                while (true) {
//                    queue.put(value);  // blocks if full
//                    System.out.println("Produced: " + value);
//                    value++;
//                    Thread.sleep(500);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        // Consumer Thread
//        Thread consumer = new Thread(() -> {
//            try {
//                while (true) {
//                    int value = queue.take();  // blocks if empty
//                    System.out.println("Consumed: " + value);
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        producer.start();
//        consumer.start();
//    }
//}
