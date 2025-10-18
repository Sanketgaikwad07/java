package extra;

public class Problem {
    
    public static void main(String[] args) {
        for (int i = 1; i > 0; i++) {
            MultiProblem mything = new MultiProblem(i);
            Thread thread = new Thread(mything);
            System.out.println(i + " Good Morning Nandu ");
            System.out.println(thread + "smach");        }
        }
    }

