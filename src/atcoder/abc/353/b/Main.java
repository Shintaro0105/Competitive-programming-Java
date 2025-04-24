import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a;
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans = 0;
        int i = 0, j = 0;
        while(i < n){
            int sum = 0;
            j = i;
            while(j < n){
                if(sum + a[j] <= k){
                    sum += a[j];
                    j++;
                    if(j == n){
                        ans++;
                        break;
                    }
                }else{
                    ans++;
                    break;
                }
            }
            // System.out.println(i);
            // System.out.println(j);
            i = j;
        }
        System.out.println(ans);
    }
}