import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices, values decreasing

        for (int i = 0; i < n; i++) {
            // Remove indices whose values are smaller than current from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            // Remove front if it's out of this window
            if (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Record result once we have a full window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}