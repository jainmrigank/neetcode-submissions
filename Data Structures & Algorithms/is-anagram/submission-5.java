class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] counts = new int[128];

        for(int i=0; i<s.length(); i++) {
            counts[s.charAt(i)]++;
            counts[t.charAt(i)]--;
        }

        for(int val: counts) {
            if(val!=0)
                return false;
        }
        return true;
    }
        
}

