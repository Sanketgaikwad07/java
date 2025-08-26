package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] all={3,9,7,8,3,6};

        System.out.println(Arrays.toString(sum(all,9)));

    }
    public static int[]sum(int[] num,int target){
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;i++){
            int sum_all=target-num[i];
            if(hm.containsKey(sum_all))
            {
                int[] arr={hm.get(sum_all),i};
                return arr;
            }
            hm.put(num[i],i);
        }
        return null;
    }
}
