class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
    Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
        
        for (String word : words) {
            if (!bannedWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        int maxCount = 0;
        String mostCommon = "";
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommon = entry.getKey();
            }
        }
        
        return mostCommon;    
    }
}