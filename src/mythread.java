public class mythread {
    public void run() {
        System.out.println("Thread is Going");
    }


    public static void main(String[] args)  {


        mythread my = new mythread();
        my.run();

    }
}