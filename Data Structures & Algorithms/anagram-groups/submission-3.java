class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedString = Arrays.toString(c);
            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(str);
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> l: map.values()) {
            res.add(l);
        }
        return res;
    }
}
