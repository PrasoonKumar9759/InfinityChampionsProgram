import java.util.*;
public class MedianOfTwoSortedArray{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int[] arr1=new int[n1];
       int[] arr2=new int[n2];
       for(int i=0;i<n1;i++){
        arr1[i]=sc.nextInt();
       }
       for(int i=0;i<n2;i++){
        arr2[i]=sc.nextInt();
       }
       System.out.print(call(arr1,arr2));
    }
    public static double call(int[] a,int[] b){
        int n=a.length;
        int m=b.length;
        if(n>m) return call(b,a);
        int l=0;
        int h=n;
        int left=(n+m+1)/2;
        while(l<=h){
            int mid1=(l+h)>>1;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
            if(mid1<n) r1=a[mid1];
            if(mid2<m) r2=b[mid2];
            if(mid1-1>=0) l1=a[mid1-1];
            if(mid2-1>=0) l2=b[mid2-1];
            if(l1<=r2 && l2<=r1){
                if((n+m)%2!=0){
                    return Math.max(l1,l2);
                }else{
                    return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            }else if(l1>r2){
                h=mid1-1;
            }else{
                l=mid1+1;
            }
        }
        return -1;
    }
}