class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i< s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                // c is lowercase a-z or a digit 0-9
                sb.append(Character.toLowerCase(c));
            }  
        }
        String str = sb.toString();

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
