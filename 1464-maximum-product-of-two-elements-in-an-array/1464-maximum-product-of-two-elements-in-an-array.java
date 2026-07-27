class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
       int mx1 = (nums[len-1] -1) * (nums[len-2] -1);
       int mx2 =( nums[0] -1 )* (nums[1] -1);
       return Math.max(mx1,mx2);
    }
}