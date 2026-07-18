class Solution {
    public int findMin(int[] nums) {
        // With linear Search 
        Arrays.sort(nums);
        return nums[0];
    }
}