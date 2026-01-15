import java.util.*;
public class FirstMissingPositiveInteger{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(call(arr));
    }
    public static int call(int[] nums){
        int n=nums.length;
        boolean one=false;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                one=true;
                break;
            }
        }
        if(!one) return 1;
        for(int i=0;i<n;i++){
            if(nums[i]<1 || nums[i]>n){
                nums[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[Math.abs(nums[i])-1]>0){
                int idx=Math.abs(nums[i]);
                nums[idx-1]=-nums[idx-1];
            }
        }
        // System.out.print(Arrays.toString(nums));
        for(int i=1;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}