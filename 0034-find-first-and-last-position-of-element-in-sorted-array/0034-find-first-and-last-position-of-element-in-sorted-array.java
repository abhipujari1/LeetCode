class Solution {
        public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int leftIdx = binarySearchLeft(nums, target);
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return result;
        }
        result[0] = leftIdx;
        result[1] = binarySearchRight(nums, target) - 1;
        return result;
    }

    private int binarySearchLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int binarySearchRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}