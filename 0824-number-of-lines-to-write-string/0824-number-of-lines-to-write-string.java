class Solution {
    public int[] numberOfLines(int[] widths, String s) {
             int totalLines = 1;
        int lineWidth = 0;
        
        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];
            if (lineWidth + width > 100) {
                totalLines++;
                lineWidth = width;
            } else {
                lineWidth += width;
            }
        }
        
        return new int[]{totalLines, lineWidth};
   
    }
}