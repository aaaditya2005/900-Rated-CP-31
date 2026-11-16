import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xk = sc.nextInt();
            int yk = sc.nextInt();
            int xq = sc.nextInt();
            int yq = sc.nextInt();

            long[] dx = {a, a, -a, -a, b, b, -b, -b};
            long[] dy = {b, -b, b, -b, a, -a, a, -a};

            Set<String> king = new HashSet<>();
            Set<String> queen = new HashSet<>();

            for (int i = 0; i < 8; i++) {
                king.add((xk + dx[i]) + "," + (yk + dy[i]));
                queen.add((xq + dx[i]) + "," + (yq + dy[i]));
            }

            int ans = 0;
            for (String pos : king) {
                if (queen.contains(pos)) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
