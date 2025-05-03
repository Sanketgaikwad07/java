 class Backtracking {
    public static void premprint(String str,String prem,int idx){
        if(str.length()==0){
            System.out.println(prem);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            premprint(newstr,prem+currChar,idx+1);


        }
    }

    public static void main(String[] args) {
        String str="abc";
        premprint(str," ",0);
    }
}
