import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        // vector<set<int>> に相当
        ArrayList<Set<Integer>> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(new HashSet<>());
        }

        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 2) {
                int x = sc.nextInt() - 1;
                s.get(x).add(0);
            } else {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt();
                if (t == 1) {
                    s.get(x).add(y);
                } else {
                    if (s.get(x).contains(0) || s.get(x).contains(y)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }

        sc.close();
    }
}
