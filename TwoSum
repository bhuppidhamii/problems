Qs:- https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int op[]=new int[2];
        int k=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(nums[i]+nums[j]==target){
                    op[k]=i;
                    k++;
                    op[k]=j;
                }
            }
        }
        return op;
    }
}