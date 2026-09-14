class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replace(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i< str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                // c is lowercase a-z or a digit 0-9
                sb.append(str.substring(i, i+1));
            }  
        }
        str = sb.toString();

        int i=0;int j=str.length()-1;
        while(i<=j) {
            if(str.charAt(i) != str.charAt(j)) {
                break;
            }
            i++;j--;
        }

        return j<=i;
    }
}
