import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        int len = p.length();
        for (int i = 0; i <= s.length() - len; i++) {
            String sub = s.substring(i, i + len);
            char[] subArr = sub.toCharArray();
            Arrays.sort(subArr);
            if (Arrays.equals(pArr, subArr)) {
                result.add(i);
            }
        }
        return result;
    }
}
