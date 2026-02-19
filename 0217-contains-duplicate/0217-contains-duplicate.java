class Solution {
    public boolean containsDuplicate(int[] nums) {

       
        Set<Integer> Seen= new HashSet<>(nums.length);

        for(int num:nums){
            if(!Seen.add(num)){
                return true;
            }
        }
        return false;
    }
}