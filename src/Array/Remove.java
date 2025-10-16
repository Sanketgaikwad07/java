package Array;

public class Remove {
    public static void main(String[] args) {
        int nm[] = {1, 1, 2, 3, 4, 2, 5, 5, 6, 7, 7, 6};
        int sum = nm.length;

            int[] teamp = new int[sum];

        for (int i = 0; i<sum; i++) {

            if (i != teamp[i +1]) {
                teamp[sum++] = nm[i];
            }
        }
        System.out.println(sum);
        for (int j = 0; j < sum; j++) {
            System.out.println(teamp[j]+" ");
    }


            }

        }
