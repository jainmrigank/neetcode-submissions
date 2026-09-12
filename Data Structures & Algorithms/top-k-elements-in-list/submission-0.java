class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num)+1);
        }
        
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for(int i = 0; i<k;i++) {
            res[i] = entries.get(i).getKey();
        }
        return res;
    }
    
}
