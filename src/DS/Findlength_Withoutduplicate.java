package DS;

import java.util.HashSet;
import java.util.Set;

public class Findlength_Withoutduplicate
{
    public int lengthWithoutDuplicate(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        int maxLength=0;
        int i=0;
        int j=0;
        Set<Character> charSet=new HashSet<>();
        while(j<s.length()){
            if(!charSet.contains(s.charAt(j))){
                charSet.add(s.charAt(j));
                maxLength=Math.max(maxLength,j-i+1);
                j++;
            }else{
                charSet.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }


    public static void main(String[] args) {
        String str="sasanionesaanertnre";
        Findlength_Withoutduplicate find=new Findlength_Withoutduplicate();
        int result=find.lengthWithoutDuplicate(str);
        System.out.println("The length of the longest substring without duplicates is: " + result);

    }




}
