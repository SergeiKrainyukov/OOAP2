import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(42);
        List<? extends Number> l2 = l1;

        List<Number> l3 = new ArrayList<>();
        List<? super Double> l4 = l3;
    }
}

