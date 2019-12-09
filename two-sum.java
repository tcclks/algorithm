class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        //哈希表存储数组元素和其对应的数组下标
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            maps.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (maps.containsKey(target - nums[i]) && maps.get(target - nums[i]) != i) {
                return new int[]{i, maps.get(target - nums[i])};
            }
        }
        return null;
    }
}
