import java.util.Arrays;

class Solution{
    public int[] sortedSquares(int[] nums){
        int x=nums.length;
        int[] ans=new int[x];
        for(int i=0;i<x;i++)
        {
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}