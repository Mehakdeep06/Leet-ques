class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int min = nums[0];
        int mini = min;
        int maxx = nums[len-1];
         while(mini>0){
            if(min%mini ==0 && maxx%mini ==0)
            return mini;
            mini--;
         }
         return 1;
    }
}