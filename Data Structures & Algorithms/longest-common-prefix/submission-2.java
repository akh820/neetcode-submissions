class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minStr = strs[0];
        for (String s : strs) {
            if (s.length() < minStr.length()) minStr = s;
        }

        int mL = minStr.length();

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < mL; j++) {
                if (minStr.charAt(j) != strs[i].charAt(j)) {
                    mL = Math.min(j, mL);
                }
            }
        }

        return minStr.substring(0, mL);
    }
}