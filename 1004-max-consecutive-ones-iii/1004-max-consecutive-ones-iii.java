class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,count=0,maxLength=0;
        while(r<nums.length){
            if(nums[r]==0){
                count++; 
                 while(l<=r&&count>k){
                if(nums[l]==0){
                    count--;
                }
                l++;
            }
        }
        maxLength=Math.max( maxLength,r-l+1);
          r++;      
        }
            
        return maxLength;
    }
}