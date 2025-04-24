import java.util.*;
public class Main {
    static long MOD = 100000000;
    public static int lowerbound(long[] a, long key) {
        if(a[a.length-1] < key)
            return a.length;
        int lb = -1, ub = a.length, mid;
        do {
            mid = (ub+lb)/2;
            if(a[mid] >= key)
                ub = mid;
            else
                lb = mid;
            // System.out.println(lb);
            // System.out.println(ub);
        }while(lb+1 < ub);
        // System.out.println(lb);
        // System.out.println(ub);
        return ub;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long[] a; 
        a = new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            sum+=a[i];
        }
        Arrays.sort(a);
        long ans=0;
        for(int i=0;i<n;i++){
            int j=lowerbound(a, MOD-a[i]);
            //System.out.println(j);
            if(j>=n){
                ans+=sum+a[i]*(n-2);
            }else{
                ans+=sum+a[i]*(n-2)-(n-j)*MOD;
            }
            if(j<=i)ans+=MOD;
        }
		System.out.println(ans/2);
	}
}
