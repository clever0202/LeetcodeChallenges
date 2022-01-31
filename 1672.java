class Solution {
    int sumArray(int[] nums){
        int ret = 0;
        for(int i=0; i<nums.length; i++){
            ret += nums[i];
        }
        return ret;
    }

    public int maximumWealth(int[][] accounts) {
        int maxi = 0;
        for(int i=0; i<accounts.length; i++){
            int plus = sumArray(accounts[i]);
            if(plus > maxi){
                maxi = plus;
            }
        }
        return maxi;
    }
}