class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Map<String, Integer> reversedMap = new HashMap<>();
        int pairs = 0;

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (reversedMap.containsKey(reversed) && reversedMap.get(reversed) > 0) {
                pairs++;
                reversedMap.put(reversed, reversedMap.get(reversed) - 1);
            } else {
                reversedMap.put(word, reversedMap.getOrDefault(word, 0) + 1);
            }
        }

        return pairs;
    }
}