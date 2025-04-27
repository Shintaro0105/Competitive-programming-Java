import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t,u;
        t=sc.nextLine();
        u=sc.nextLine();
        char[] tt=t.toCharArray();
        char[] uu=u.toCharArray();
        boolean flag=false;
        for(int i=0;i<=t.length()-u.length();i++){
            boolean f=true;
            for(int j=0;j<u.length();j++){
                if(!(tt[i+j]==uu[j]||tt[i+j]=='?')){
                    f=false;
                }
            }
            if(f)flag=true;
        }
        if(flag)System.out.println("Yes");
        else System.out.println("No");
    }
}