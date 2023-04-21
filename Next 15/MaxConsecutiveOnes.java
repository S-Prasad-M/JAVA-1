class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                cur++;
            }
            else{
                max = Math.max(max,cur);
                cur = 0;
            }
        }
        max = Math.max(max,cur);
        return max;
    }
        
}