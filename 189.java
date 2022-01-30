import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int[] ref = Arrays.copyOf(nums, nums.length);
        for(int i=0; i<nums.length; i++){
            ref[(i+k)%nums.length] = nums[i];
        }
        nums = ref;
    }
}