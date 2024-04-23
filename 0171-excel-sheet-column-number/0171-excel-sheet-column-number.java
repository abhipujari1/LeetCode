class Solution {
    public int titleToNumber(String columnTitle) {
                int result = 0;
        for (char ch : columnTitle.toCharArray()) {
            int numericValue = ch - 'A' + 1;
            result = result * 26 + numericValue;
        }
        return result;

    }
}