import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] seen = new boolean[n];
        for (int i = 0; i < n - 1; i++) {
            int curr = sc.nextInt();
            seen[curr - 1] = true;
        }

        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
