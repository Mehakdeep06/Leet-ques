class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(i = 0;i<len-1;i++){
            int current = nums[i];

            while(current+1 < nums[i+1]){
                current++;
                list.add(current);
            }
        }
        return list;
    }
}