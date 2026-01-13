import java.util.*;
public class BuyAndSellStock{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){
        int n=arr.length;
        int mini=arr[0];
        int profit=0;
        for(int i=0;i<n;i++){
            if(profit<arr[i]-mini){
                profit=arr[i]-mini;
            }
            if(mini>arr[i]){
                mini=arr[i];
            }
        }
        return profit;
    } 
}