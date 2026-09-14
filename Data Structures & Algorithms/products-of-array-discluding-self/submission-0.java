class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int productForZero = 1;
        boolean hasZero = false;
        int[] output = new int[nums.length];
        for(int num : nums) {
            if(num == 0 && !hasZero) {
                hasZero = true;
                productForZero = product;
            } else if(hasZero) {
                productForZero = productForZero*num; 
            } else 
                product = product*num;
        }
        for(int i=0;i<nums.length;i++) {
            if(hasZero && nums[i] == 0) {
                output[i] = productForZero;
            } else if(hasZero)
                output[i] = 0;
            else
                output[i] = product/nums[i];
        }
        return output;
    }
}  
