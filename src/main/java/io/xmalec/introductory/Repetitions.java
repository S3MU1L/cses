import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int best = 1;
        int current = 1;
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                current++;
            } else {
                best = Math.max(best, current);
                current = 1;
            }
        }
        best = Math.max(best, current);
        System.out.println(best);
    }
}
