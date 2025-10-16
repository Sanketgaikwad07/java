package Question;

public class CountWord {
    public static void main(String[] args) {
        String str="one two three   ";
        int count=str.split("\\s").length;
        System.out.println(count);
    }
}
