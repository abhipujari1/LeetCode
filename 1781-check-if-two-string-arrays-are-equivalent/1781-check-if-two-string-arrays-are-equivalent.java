class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return concatenateWords(word1).equals(concatenateWords(word2));
    }
    
    private String concatenateWords(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }
}