class Solution {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int[] target = countLetters(licensePlate.toLowerCase());
        String shortestWord = null;
        
        for (String word : words) {
            if ((shortestWord == null || word.length() < shortestWord.length()) && containsLetters(word.toLowerCase(), target)) {
                shortestWord = word;
            }
        }
        
        return shortestWord;
    }
    
    private static int[] countLetters(String str) {
        int[] count = new int[26];
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count[c - 'a']++;
            }
        }
        return count;
    }
    
    private static boolean containsLetters(String word, int[] target) {
        int[] count = countLetters(word);
        for (int i = 0; i < 26; i++) {
            if (count[i] < target[i]) {
                return false;
            }
        }
        return true;
    }
}