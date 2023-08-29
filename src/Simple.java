import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int aInt = (int) (a * 1000);
        int bInt = (int) (b * 1000);
        System.out.println(aInt);
        System.out.println(bInt);
    }
}
