class twoDArray {

    public static void main(String[] args) {

        int[][] myArr = new int[5][3];
        myArr[0][0] = 8;


        int[][] arr = {{1, 3, 4}, {5, 4, 9}, {6, 7, 9}, {4, 5}, {6, 7}};
        System.out.println(myArr.length);


        int i = 0;
        while (i < myArr[i].length) {
            int j = 0;
            while (j < myArr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }


}
