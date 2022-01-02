class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int reversecount = 0;
        for(int i=0; i<nums.length-1; i ++){
            if(nums[i + 1] <= nums[i]){
                if(i>0 && i<nums.length-2){
                    if(nums[i+1] <= nums[i-1] && nums[i+2] <= nums[i]){
                        return false;
                    }
                }
                reversecount += 1;
                if(i<nums.length-2){
                    if(nums[i + 2] <= nums[i+1]){
                        return false;
                    }
                }
            }
        }
        if(reversecount > 1){
            return false;
        }
        return true;
    }
}