class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

                        if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            }
        }


        return new ArrayList<>(map.values());

    }
}