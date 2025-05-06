 class PrintwihoutNumber {
    public static void main(String[] args) {
        String first="*";
        String last="**********";
        for(int i=first.length();i<=last.length()*last.length();i++){
            System.out.println(i);
        }
    }
}
