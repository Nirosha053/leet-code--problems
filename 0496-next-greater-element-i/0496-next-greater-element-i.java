import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        var arr = nextLargerElement(nums2);
         int i,j ,index=0;
        int[] ans = new int[nums1.length];
        HashMap<Integer,Integer> h1=new HashMap<>();
      

        for (i = 0; i < nums2.length; i++) {
            h1.put(nums2[i],i);
        }
       for(i=0;i<nums1.length;i++){
        int index1=h1.get(nums1[i]);
        ans[index++]=arr.get(index1);
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