//public class number {
//
//    public static void main(String[] args) {
//
//
//        for (int i = 1; i <=10; i++){
//            System.out.println("Hey baby");
//        }
//    }
//}
 class number {
    public static void main(String[] args) throws InterruptedException {
        double A = 0, B = 0;
        double i, j;
        double z[] = new double[1760];
        char b[] = new char[1760];
        System.out.print("\u001b[2J"); // Clear screen

//        for (; ; )
{
            java.util.Arrays.fill(b, 0, 1760, ' ');
            java.util.Arrays.fill(z, 0, 1760, 0);
            for (j = 0; 6.28 > j; j += 0.07) {
                for (i = 0; 6.28 > i; i += 0.02) {
                    double c = Math.sin(i),
                            d = Math.cos(j),
                            e = Math.sin(A),
                            f = Math.sin(j),
                            g = Math.cos(A),
                            h = d + 2,
                            D = 1 / (c * h * e + f * g + 5),
                            l = Math.cos(i),
                            m = Math.cos(B),
                            n = Math.sin(B),
                            t = c * h * g - f * e;
                    int x = (int) (40 + 30 * D * (l * h * m - t * n)),
                            y = (int) (12 + 15 * D * (l * h * n + t * m)),
                            o = x + 80 * y,
                            N = (int) (8 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n));
                    if (1760 > o && o > 0 && D > z[o]) {
                        z[o] = D;
                        b[o] = "2 3 4 5 6 7 8 9".charAt(Math.max(0, N));
                    }
                }
            }

            System.out.print("\u001b[1");
            for (int k = 0; k <= 1760; k++) {
                System.out.print(k % 80 > 0 ? b[k] : "\n");
            }

            A += 0.04;
            B += 0.08;
            Thread.sleep(1); // Adjust speed
        }
    }
}
