import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();
                
                Set<Character> oddChars = new HashSet<>();
                for (char c : s.toCharArray()) {
                    if (oddChars.contains(c)) {
                        oddChars.remove(c);
                    } else {
                        oddChars.add(c);
                    }
                }
                
                int oddCount = oddChars.size();
                if (oddCount <= k + 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        sc.close();
    }
}
