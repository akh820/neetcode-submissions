class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        int maxCount = 0;
        int maxElement = 0;

        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i], 0);
            int val = map.get(nums[i]) + 1;
            map.put(nums[i], val);

            if(val > maxCount){
                maxCount = val;       
                maxElement = nums[i]; 
            }
        }
        return maxElement;
    }
}