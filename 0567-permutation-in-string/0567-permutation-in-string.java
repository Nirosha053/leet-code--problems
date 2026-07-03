class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) return false;

        int[] cnt = new int[26];
        for (char c : s1.toCharArray()) cnt[c - 'a']++;

        int diff = 0;
        for (int x : cnt) if (x != 0) diff++;

        for (int i = 0; i < m; i++) {
            if (--cnt[s2.charAt(i) - 'a'] == 0) diff--;
            else if (cnt[s2.charAt(i) - 'a'] == -1) diff++;

            if (i >= n) {
                if (++cnt[s2.charAt(i - n) - 'a'] == 0) diff--;
                else if (cnt[s2.charAt(i - n) - 'a'] == 1) diff++;
            }

            if (diff == 0) return true;
        }
        return false;
    }
}