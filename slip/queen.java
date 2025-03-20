import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private Queue<Integer> buffer;
    private int capacity;

    public SharedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full, producer is waiting...");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll();  // Notify consumers that there is an item to consume
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty, consumer is waiting...");
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notifyAll();  // Notify producers that there is space in the buffer
        return item;
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;
    private int id;

    public Producer(SharedBuffer buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = (int) (Math.random() * 100);
                buffer.produce(item);
                Thread.sleep((int) (Math.random() * 1000));  // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;
    private int id;

    public Consumer(SharedBuffer buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep((int) (Math.random() * 1500));  // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(10); // Buffer of size 10

        // Create and start multiple producer and consumer threads
        for (int i = 0; i < 3; i++) {
            new Producer(buffer, i).start();
            new Consumer(buffer, i).start();
        }
    }
}
