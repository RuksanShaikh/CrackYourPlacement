class AllPalindrome{
    
    
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> curr = new ArrayList<>();
        partition(S, 0, curr, res);
        return res;
    }
    
    static void partition(String s, int index, ArrayList<String> curr, ArrayList<ArrayList<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for (int i = index; i < s.length(); i++) {
            String temp = s.substring(index, i + 1);
            
            if (checkPalindrome(temp)) {
                curr.add(temp);
                partition(s, i + 1, curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }
    
    private static boolean checkPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}