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

// Set<Integer> set = new HashSet<>();

// // 추가
// set.add(1);
// set.add(2);
// set.add(2); // 무시됨 - 중복 불가

// // 포함 여부 확인
// set.contains(1); // true
// set.contains(9); // false

// // 삭제
// set.remove(1);

// // 크기
// set.size();

// // 비어있는지
// set.isEmpty();

// // 전체 삭제
// set.clear();