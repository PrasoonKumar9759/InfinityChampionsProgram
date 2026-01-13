import java.util.*;
public class FindTheFirstOcc{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(solve(s1,s2));
    }
    public static int solve(String s1,String s2){
        // return s1.indexOf(s2);  this done the same thing if not found then -1
        int m=s1.length();
        int n=s2.length();
        for(int i=0;i<=m-n;i++){
            if(s1.substring(i,i+n).equals(s2)){
                return i;
            }
        }
        return -1;
    }
}