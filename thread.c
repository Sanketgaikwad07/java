import java.util.Random;

public class NumberProcessor {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberSquareCalculator squareCalculator = new NumberSquareCalculator();
        NumberCubeCalculator cubeCalculator = new NumberCubeCalculator();

        Thread generatorThread = new Thread(numberGenerator);
        Thread squareThread = new Thread(squareCalculator);
        Thread cubeThread = new Thread(cubeCalculator);

        generatorThread.start();
        squareThread.start();
        cubeThread.start();
    }

    static class NumberGenerator implements Runnable {
        public void run() {
            Random random = new Random();
            while (true) {
                try {
                    int randomNumber = random.nextInt(100); // Generate random number between 0 and 99
                    System.out.println("Generated number: " + randomNumber);

                    if (randomNumber % 2 == 0) {
                        synchronized (NumberSquareCalculator.lock) {
                            NumberSquareCalculator.number = randomNumber;
                            NumberSquareCalculator.lock.notify();
                        }
                    } else {
                        synchronized (NumberCubeCalculator.lock) {
                            NumberCubeCalculator.number = randomNumber;
                            NumberCubeCalculator.lock.notify();
                        }
                    }

                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class NumberSquareCalculator implements Runnable {
        static int number;
        static final Object lock = new Object();

        public void run() {
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait();
                        int square = number * number;
                        System.out.println("Square of " + number + ": " + square);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class NumberCubeCalculator implements Runnable {
        static int number;
        static final Object lock = new Object();

        public void run() {
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait();
                        int cube = number * number * number;
                        System.out.println("Cube of " + number + ": " + cube);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
