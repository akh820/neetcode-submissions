class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        
        Arrays.sort(strs, (a,b) -> a.length() - b.length());
        // dag, dance, danger, damage;
        char[] min = strs[0].toCharArray(); // 'd','a','g';
        int mL = min.length; // 3

        for(int i = 1 ; i < n ; i++){
            char[] comparator = strs[i].toCharArray();
            for(int j = 0 ; j < mL ; j++){
                if(min[j] != comparator[j]){
                    mL = Math.min(j, mL);
                }
            }
        }        

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < mL ; i++){
            sb.append(min[i]);
        }

        return sb.toString();
    }
}