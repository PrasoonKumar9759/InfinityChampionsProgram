import java.util.*;
public class SieveOfErath{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    public static void solve(int n){
        boolean[] check=new boolean[n+1];
        check[0]=true;
        check[1]=true;
        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<n+1;j+=i){
                check[j]=true;
            }
        }
        System.out.print(Arrays.toString(check));
    }
}