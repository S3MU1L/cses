import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long row = scanner.nextLong();
            long col = scanner.nextLong();
            long res = getRes(row, col);
            System.out.println(res);
        }
    }

    private static long getRes(long row, long col) {
        long max = Math.max(row, col);
        long size = max * max;
        if (max % 2 == 0 ) {
            return size - (col - 1) - (max - row);
        }
        return size - (row - 1) - (max - col);
    }
}
