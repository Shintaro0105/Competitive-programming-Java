import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a;
        a = new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(i%2==0){
                ans+=a[i];
            }
        }
        System.out.println(ans);
    }
}