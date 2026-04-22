class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int e : nums){
            if(count == 0) candidate = e;
            count += e == candidate ? 1 : -1;
        }
        return candidate;
    }
}