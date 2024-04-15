class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
      char maxKey = keysPressed.charAt(0);
        int maxDuration = releaseTimes[0];
        
        for (int i = 1; i < releaseTimes.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            char currentKey = keysPressed.charAt(i);
            if (duration > maxDuration || (duration == maxDuration && currentKey > maxKey)) {
                maxKey = currentKey;
                maxDuration = duration;
            }
        }
        
        return maxKey;  
    }
}