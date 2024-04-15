class Solution {
      public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int keyIndex = getKeyIndex(ruleKey);
        for (List<String> item : items) {
            if (item.get(keyIndex).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
    
    private int getKeyIndex(String ruleKey) {
        switch (ruleKey) {
            case "type":
                return 0;
            case "color":
                return 1;
            case "name":
                return 2;
            default:
                return -1; // Invalid ruleKey
        }
    }
}