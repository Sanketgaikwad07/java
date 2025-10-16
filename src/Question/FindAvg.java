package Question;

public class FindAvg {
    public static void main(String[] args) {
        int[] u = {10, 30, 40, 20};
        int sum = 0;
        float avg;
        int i=u.length;
            for (int j:u) {
                sum += j;
            }
               avg=sum/i;
                System.out.println(avg);
            }

        }

