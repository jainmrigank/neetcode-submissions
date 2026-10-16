class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        //int[] res = new int[2];
        for(int i=0;i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++) {
            int x = target-nums[i];
            if(map.containsKey(x) && i != map.get(x)) {
               // res[0] = map.get(num); res[1] = map.get(x);
                return new int[]{i, map.get(x)};
            }
        }
        return new int[2];
    }
}
