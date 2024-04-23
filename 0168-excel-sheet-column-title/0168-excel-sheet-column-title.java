class Solution {
    public String convertToTitle(int columnNumber) {
               StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26; 
            char ch = (char) ('A' + remainder);
            sb.insert(0, ch);
            columnNumber = (columnNumber - 1) / 26; 
        }
        return sb.toString();
 
    }
}