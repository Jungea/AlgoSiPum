class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        int m = 1;
        for (int i=0; i<len; i++) {
            result[i] = m;
            m *= nums[i];
        }

        m = 1;
        for (int i=len-1; i>=0; i--) {
            result[i] *= m;
            m *= nums[i];
        }
        return result;
    }
}