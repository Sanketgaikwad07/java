import java.util.Scanner;

class monthSwitch {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your month score:");
        int month = sc.nextInt();
        String monthName=getMonth(month);
        System.out.println("Your month is:" + monthName);
    }

    public static String getMonth(int monthNum) {
        return  switch (monthNum) {
case 1->"January";
            case 2->"Febuary";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"September";
            case 10->"October";
            case 11->"November";
            case 12->"December";
            default ->"Invalid data";
        };
    }




}
