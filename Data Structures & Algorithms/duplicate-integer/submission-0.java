class Solution {
    public boolean hasDuplicate(int[] nums) {

        int count = 1;
        Map<Integer,Integer> dup = new HashMap<>();
        for(int num : nums){
            if(dup.containsKey(num)){
                return true;
            }
            dup.put(num,count);
        }
        return false;
    }
}