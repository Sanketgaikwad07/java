import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Your number is " + (isprime(num)?"Prime": "Not prime"));

    }
        public static boolean isprime ( int num){
for(int i=2;i<num;i++){
    if(num % i==0){
        return false;
    }
        }
return true;
    }
}

