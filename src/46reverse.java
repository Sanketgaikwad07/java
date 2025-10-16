 class rever {
    public static void main(String[] args) {
        String str="sanket";
        String reverse=" ";
       // int legnth=str.length();
        for(int i=0;i<str.length();i++){
            reverse=str.charAt(i)+reverse;
            System.out.println(reverse);
        }
        String dt="sanket";
        StringBuilder sb=new StringBuilder(dt);
        sb.reverse();
        System.out.println(sb);
//        String cnum="sanket";
//        StringBuilder sb=new StringBuilder(cnum);
//        sb.reverse();
//        System.out.println(cnum);
//        System.out.println(sb);
    }
}
