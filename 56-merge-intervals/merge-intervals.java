import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
            // Sort intervals based on the start time
                    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
                            
                                    List<int[]> ans = new ArrayList<>();
                                            
                                                    for (int[] interval : intervals) {
                                                                // If list is empty or current interval does not overlap
                                                                            if (ans.isEmpty() || interval[0] > ans.get(ans.size() - 1)[1]) {
                                                                                            ans.add(interval);
                                                                                                        } else {
                                                                                                                        // Overlap case: merge the intervals
                                                                                                                                        ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
                                                                                                                                                    }
                                                                                                                                                            }
                                                                                                                                                                    
                                                                                                                                                                            // Convert list to array
                                                                                                                                                                                    return ans.toArray(new int[ans.size()][]);
                                                                                                                                                                                        }
}                                                                                                                                                                                      
