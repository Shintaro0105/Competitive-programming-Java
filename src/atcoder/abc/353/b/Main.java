import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h;
        h = new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(h[0]<h[i]){
                System.out.println(i+1);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}