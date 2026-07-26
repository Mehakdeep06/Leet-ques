class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        // for(int i=0;i<len;i++){
        //     if(nums[i] <0)
        //     nums[i]  *= -1;
        // }
        Arrays.sort(nums);
        int p1= nums[len-1] * nums[len-2] * nums[len-3];
        int p2 = nums[0] * nums[1] * nums[len-1];
        return Math.max(p1,p2);
    }
}