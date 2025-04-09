class thread {
    int n;

    synchronized int get() {
        System.out.println("Got:  " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put: " + n);

    }
}

class producer implements Runnable {
    thread q;

    producer(thread q) {
        this.q = q;
        new Thread(this, "producer").start();

    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }

}

class Consumer implements Runnable {
    thread q;

    Consumer(thread q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();

        }
    }
}

class pc {
    public static void main(String[] args) {
        thread q = new thread();
        new producer(q);
        new Consumer(q);

    }
}