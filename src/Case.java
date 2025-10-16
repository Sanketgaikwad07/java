public class Case {
    public static void main(String[] args) {



        for(int day=0;day<=7;day++)
        switch (day) {
            case 1:
    System.out.println("Monday");
    break;
            case 2:
        System.out.println("Thesday");
        break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Tuhesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saterday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("default "+day+" ");
                break;

        }
    }
    Integer a=Integer.valueOf(2);
    Double b=Double.valueOf(3.3);
    int x=a.intValue();



}

