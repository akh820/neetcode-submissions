class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0 ; i < n; i++){
            int num = nums[i];
            if(set.contains(num)) return true;
            set.add(nums[i]);
        }

        return false;
    }
}