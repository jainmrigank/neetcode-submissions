class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[128];
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        if(s_arr.length != t_arr.length)
            return false;

        Set<Integer> set = new HashSet<Integer>();

        

        for(char schar: s_arr) {
            counts[schar]++;
        }
        for(char tchar: t_arr) {
            counts[tchar]--;
        }

        for(int val: counts) {
            if(val!=0)
                return false;
        }
        return true;
    }
}
