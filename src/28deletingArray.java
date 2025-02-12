//import java.util.Scanner;
//
//class deletingArray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("welcome the deleting sepecific array\n");
//        int[] numArr=ArrayUtilites.inputArray();
//        System.out.print("enter than number you want to delete: ");
//        int num=sc.nextInt();
//        int[] newArr=deleteNumber(numArr,num);
//        System.out.println("here is your new array");
//        ArrayUtilites.displayArray(newArr);
//    }
//    public static int[] deleteNumber(int[] numArr,int numToDelete ) {
//        int occ = OccurrecesArray.noOfOccurrences(numArr, numToDelete);
//
//        if (occ == 0) {
//            return numArr;
//        }
//            int newSize = numArr.length - occ;
//
//int[] newArr=new int[newSize];
//
//int i=0,j=0;
//while(i < numArr.length){
//    if(numArr[i]!=numToDelete){
//        newArr[j]=numArr[i];
//        j++;
//    }
//    i++;
//}
//
//
//return newArr;
//
//    }
//
//
//
//    }
//
