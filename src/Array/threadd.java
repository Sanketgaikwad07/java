package Array;

public class threadd {
    private int c=8;
    public synchronized void inc(){
        c++;
    }
    public synchronized  int get(){
        return c;
    }
}
class counter{
    public static void main(String[] args) {
        threadd innt=new threadd();


        Thread t1=new Thread(()->{

            for(int i=0;i<1000;i++){
            innt.inc();
            }
        });
        Thread t2=new Thread(()->{
       for(int i=0;i<1000;i++){
           innt.inc();
       }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("counter: "+ innt.get());
        }
    }

