class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        return Arrays.equals(sArr, tArr);
    }
}
// String s를 char c배열에 할당하여라
// char[] c = s.toCharArray();

// char c 배열을 오름차순으로 정렬하여라
// Arrays.sort(c);

// char c 배열을 내림차순으로 정렬하여 newC에 할당하여라
// char[] newC = new StringBuilder(new String(c)).reverse().toString().toCharArray();