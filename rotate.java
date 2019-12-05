public class SolutionRotate {
    public void rotate(int[] nums, int k) {
/*        //O(kn)的解法
        for (int i = 0; i < k; i++) {
            int c = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = c;
        }*/

        // 翻转所有元素，然后翻转前k个元素，再翻转后面n - k个元素
        // O(n)
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    private void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}