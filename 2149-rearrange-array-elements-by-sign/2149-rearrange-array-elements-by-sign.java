class Solution {
    public int[] rearrangeArray(int[] nums) {

        int numsLength = nums.length;
        int[] finalAns = new int[nums.length];
        int pos=0,neg=1,i;

        for( i = 0; i <numsLength; i++) {
            if (nums[i] > 0) {
                finalAns[pos]=nums[i];
                pos=pos+2;
            } else {
               finalAns[neg]=nums[i];
               neg=neg+2;
            }
        }
        return finalAns;
    }
}