class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
                String startTime1 = event1[0];
        String endTime1 = event1[1];
        String startTime2 = event2[0];
        String endTime2 = event2[1];
        
        // Convert start and end times to minutes for easier comparison
        int start1 = Integer.parseInt(startTime1.substring(0, 2)) * 60 + Integer.parseInt(startTime1.substring(3));
        int end1 = Integer.parseInt(endTime1.substring(0, 2)) * 60 + Integer.parseInt(endTime1.substring(3));
        int start2 = Integer.parseInt(startTime2.substring(0, 2)) * 60 + Integer.parseInt(startTime2.substring(3));
        int end2 = Integer.parseInt(endTime2.substring(0, 2)) * 60 + Integer.parseInt(endTime2.substring(3));
        
        // Check for overlap
        return (start1 <= end2 && end1 >= start2);

    }
}