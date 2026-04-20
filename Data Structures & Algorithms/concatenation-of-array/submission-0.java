class Solution {
    public int[] getConcatenation(int[] nums) {
        int idx = 0;
        int[] arr = new int[nums.length*2];
        for(int i = 0 ; i < 2; i++){
            for(int j = 0 ; j < nums.length; j++){
                arr[idx] = nums[j];
                idx++;
            }
        }

        return arr;
        
    }
}