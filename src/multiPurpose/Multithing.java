package multiPurpose;

public class Multithing extends Thread {//implemnet runable is a other way to create thread class
    private int threadNumber;
    public  Multithing(int threadNumber){
        this.threadNumber=threadNumber;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from threadNumber " +threadNumber);
//            if(threadNumber ==4){
//                throw new RuntimeException("something went wrong");
//            }
          try{
                Thread.sleep(2000);
            } catch (Exception e){
              System.out.println("not done");

          }
        }
    }}
