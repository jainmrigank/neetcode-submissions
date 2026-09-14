class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        for(int num: set) {
            if(!set.contains(num - 1)) {
                int cur = num;
                while(set.contains(cur)) {
                    cur+=1;
                }
                if(res<(cur-num))
                    res = cur-num;
            }

        }
        return res;
    }
}

