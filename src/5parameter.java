class parameter {

    public static void main(String[] args) {

//int num=sumtonumber(4,7);
        System.out.println(sumtonumber(4, 7));


        System.out.println(sumtonumber(4, 8));
        System.out.println(sumtonumber(-6, 9));
        System.out.println(sumtonumber(124, 678));

    }

    public static int sumtonumber(int firstNum, int secondNum) {
        System.out.println("first received number" + firstNum);
        System.out.println("second received number" + secondNum);
//int sum=firstNum+secondNum;
        return firstNum + secondNum;

    }
}
