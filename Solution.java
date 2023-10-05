class Solution {
    public int lengthOfLongestSubstring(String s) {
       
     String newString = "", temp = "";
        List<Integer> lines = new ArrayList<Integer>();
        HashSet<Character> set = new HashSet<Character>();
       if (s.equals(" ")|| s.length()==1)
           return 1;
        else
        for (int i = 0; i < s.length()-1; i++) {
            for (int k = i; k < s.length(); k++) {
                if (set.contains(s.charAt(k))) {
                    lines.add(temp.length());
                    temp = "";
                    set.clear();
break;
                } else {
                    set.add(s.charAt(k));
                    temp += s.charAt(k);
                }
            }
        }
       lines.add(temp.length());
Collections.sort(lines,Collections.reverseOrder());
        return(lines.get(0));
    }
}
