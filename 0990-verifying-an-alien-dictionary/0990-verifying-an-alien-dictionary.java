class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> charOrder = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            charOrder.put(order.charAt(i), i);
        }
        
        for (int i = 0; i < words.length - 1; i++) {
            if (!isSorted(words[i], words[i + 1], charOrder)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isSorted(String word1, String word2, Map<Character, Integer> charOrder) {
        int minLength = Math.min(word1.length(), word2.length());
        
        for (int i = 0; i < minLength; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            
            if (charOrder.get(c1) < charOrder.get(c2)) {
                return true;
            } else if (charOrder.get(c1) > charOrder.get(c2)) {
                return false;
            }
        }
        
        return word1.length() <= word2.length();
    }
}