import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(16);
        num.add(33);
        num.add(251);
        num.add(13);
        num.add(251);
        num.add(1);
        num.add(22);
        int result = num.stream().distinct().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(result);
    }
}