import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if(n%2==1) System.out.println(1);
            else {
                long ans = 2;
                while (n % (ans + 1) == 0) {
                    ans++;
                }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
