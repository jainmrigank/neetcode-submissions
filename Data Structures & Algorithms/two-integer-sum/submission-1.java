class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++) {
            int k = target - nums[i];
            if(map.containsKey(k) && map.get(k) != i) {
                res[0]=i;
                res[1]=map.get(k);
                return res;
            }
        }
        return res;
    }
}
