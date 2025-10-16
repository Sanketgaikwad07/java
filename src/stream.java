import java.util.*;
import java.util.stream.*;

public class stream {
    public static void main(String[] args) {
List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);

List<Integer> Squar=list.stream().map(x->x*x).collect(Collectors.toUnmodifiableList());
        System.out.println(Squar);
    }
}
