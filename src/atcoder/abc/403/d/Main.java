import java.util.*;
public class Main {
    static long MOD = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long[][] r;
        r=new long[11][n];
        long[] a;
        a=new long[n];
        int[] c;
        c=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            r[0][i]=a[i]%MOD;
            for(int j=1;j<11;j++){
                r[j][i]=(r[j-1][i]*10)%MOD;
            }
            long t=a[i];
            while(t>0){
                c[i]++;
                t/=10;
            }
            // System.out.println(c[i]);
        }
        for(int i=0;i<11;i++){
            //Arrays.sort(r[i]);
            for(int j=0;j<n-1;j++){
                r[i][j+1]+=r[i][j];
                r[i][j+1]%=MOD;
            }
        }
        long ans=0;
        for(int i=1;i<n;i++){
            ans+=r[c[i]][i-1]+i*r[0][i];
            ans%=MOD;
        }
        System.out.println(ans);
	}
}
