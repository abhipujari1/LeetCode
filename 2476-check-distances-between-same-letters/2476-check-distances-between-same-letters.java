class Solution {
    public boolean checkDistances(String s, int[] distance) {
                int[] index = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (index[idx] == 0) {
                index[idx] = i + 1; 
            } else {
                if (i - index[idx] != distance[idx]) {
                    return false;
                }
                index[idx] = 0;
            }
        }
        return true;

    }
}