package multiPurpose;

public class MultiThreading {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Multithing mything =new Multithing(i);
Thread thread=new Thread(mything);
            thread.start();
            //myThread.join();
        }
//throw new RuntimeException();
    }
}
