import java.util.*;
public class Main {
    static long MOD = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long[][] r;
        r=new long[n][11];
        long[] a;
        a=new long[n];
        int[] c;
        c=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            r[i][0]=a[i]%MOD;
            for(int j=1;j<11;j++){
                r[i][j]=(r[i][j-1]*10)%MOD;
            }
            long t=a[i];
            while(t>0){
                c[i]++;
                t/=10;
            }
        }
        
        
		System.out.println();
	}
}
