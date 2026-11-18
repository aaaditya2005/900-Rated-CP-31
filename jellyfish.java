import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();
                long maxtime = b;
                for(int i =0;i<n;i++){
                    int ele = sc.nextInt();
                    maxtime += Math.min(ele,a-1);
                }
                System.out.println(maxtime);
            }
        sc.close();
    }
}
