class Solution {
    public int longestPalindrome(String s) {
        int[] charCounts = new int[128];
        for(char c : s.toCharArray()) {
            charCounts[c]++;
        }
        int total = 0;
        for(int i : charCounts) {
            total += i/2*2;
            if(total % 2 == 0 && i % 2 == 1) {
                total++;
            }
        }
        return total;
    }
}