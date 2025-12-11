import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("1");
            return;
        }
        if (n == 4) {
            System.out.println("2 4 1 3");
            return;
        }
        if (n < 4) {
            System.out.println("NO SOLUTION");
            return;
        }

        var nums = new ArrayList<Integer>();

        int evenStart = n % 2 == 0 ? n : n - 1;
        StringBuilder sb = new StringBuilder();
        addFrom(sb, evenStart, -2);

        int oddStart = n % 2 == 1 ? n : n - 1;
        addFrom(sb, oddStart, -2);

        System.out.println(String.join(" ", sb.toString()));
    }

    private static void addFrom(StringBuilder sb, int n, int increment) {
        while (n > 0) {
            sb.append(n).append(" ");
            n += increment;
        }
    }
}
