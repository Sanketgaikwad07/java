package extra;

public class MultiProblem extends Thread {
    private int Question;

    public MultiProblem(int Question) {

        this.Question = Question;
    }

    @Override
    public void run() {
        for (int i = 1; i >= 0; i++) {
            System.out.println(i + "Good Morning Nandu " +Question);



            try {
                Thread.sleep(4000);
            }catch (Exception e){
                System.out.println("Not Done");
            }
        }

    }
}
