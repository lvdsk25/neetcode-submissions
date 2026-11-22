class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();


        // Step 1: Add all numbers to HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Traverse HashSet
        for (int num : set) {

            // Step 3: Check if it is the starting number
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Step 4: Find consecutive numbers
                while (set.contains(currentNum + 1)) {

                    currentNum++;
                    count++;
                }

                // Step 5: Update maximum length
                longest = Math.max(longest, count);
            }
        }

        return longest;
        
    }
}
