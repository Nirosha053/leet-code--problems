class Solution {
    public int[] rearrangeArray(int[] nums) {

        int numsLength = nums.length;
        int[] finalAns = new int[nums.length];
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];

        int posIndex = 0;
        int negIndex = 0;
        for (int i = 0; i < numsLength; i++) {
            if (nums[i] > 0) {
                pos[posIndex] = nums[i];
                posIndex++;
            } else {
                neg[negIndex] = nums[i];
                negIndex++;
            }
        }

        int finalIndex = 0;
        for (int i = 0; i < numsLength / 2; i++) {
            finalAns[finalIndex] = pos[i];
            finalAns[finalIndex + 1] = neg[i];
            finalIndex = finalIndex + 2;
        }

        return finalAns;
    }
}