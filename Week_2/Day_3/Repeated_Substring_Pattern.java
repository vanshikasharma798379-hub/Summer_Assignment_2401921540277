class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len=1;len<= n/2;len++) {
            if (n % len == 0) {
                String sub = s.substring(0, len);
                String result = "";
                int times =n/len;
                for (int i = 0; i < times; i++) {
                    result += sub;
                }

                if (result.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
