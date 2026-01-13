import java.util.*;
public class ThreeSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr));
    }
    public static ArrayList<ArrayList<Integer>> solve(int[] nums){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(l<r){
                int target=nums[i]+nums[l]+nums[r];
                if(target<0){
                    l++;
                }else if(target>0){
                    r--;
                }else{
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ans.add(list);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }
            }
        }
        return ans;
        
    }
}