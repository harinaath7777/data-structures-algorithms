class Solution {
        public int maxDepth(String s) {
                // res → stores the maximum depth found so far
                        // cur → stores the current depth while scanning the string
                                int maxDepth = 0;
                                        int currentDepth = 0;

                                                // \U0001f501 Traverse each character of the string
                                                        for (int i = 0; i < s.length(); i++) {
                                                                    char ch = s.charAt(i);

                                                                                // If we find an opening bracket '(', we go one level deeper
                                                                                            if (ch == '(') {
                                                                                                            currentDepth++; // increase current depth
                                                                                                                            // Update maxDepth if current depth is greater
                                                                                                                                            maxDepth = Math.max(maxDepth, currentDepth);
                                                                                                                                                        }

                                                                                                                                                                    // If we find a closing bracket ')', we come one level up
                                                                                                                                                                                else if (ch == ')') {
                                                                                                                                                                                                currentDepth--; // decrease current depth
                                                                                                                                                                                                            }
                                                                                                                                                                                                                    }

                                                                                                                                                                                                                            // ✅ Return the maximum nesting depth of parentheses
                                                                                                                                                                                                                                    return maxDepth;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        }

