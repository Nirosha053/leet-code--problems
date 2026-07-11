import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = nextLargerElement(nums2);

        int[] ans = new int[nums1.length];

        int i, j;

        for (i = 0; i < nums1.length; i++) {
            for (j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    ans[i] = arr.get(j);
                    break;
                }
            }
        }

        return ans;
    }

    public ArrayList<Integer> nextLargerElement(int[] arr) {

        ArrayList<Integer> l1 = new ArrayList<>();
        Stack<Integer> s1 = new Stack<>();

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {

            while (!s1.isEmpty() && arr[i] >= s1.peek()) {
                s1.pop();
            }

            if (s1.isEmpty()) {
                l1.add(-1);
            } else {
                l1.add(s1.peek());
            }

            s1.push(arr[i]);
        }

        Collections.reverse(l1);
        return l1;
    }
}