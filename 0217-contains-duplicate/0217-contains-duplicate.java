class Solution {
    public boolean containsDuplicate(int[] nums) {

       
        Set<Integer> Seen= new HashSet<>(nums.length);

        for(int i = 0; i< nums.length; i++){
            if(Seen.contains(nums[i])){
               return true;
            }else{
                Seen.add(nums[i]);
            }
        }
        return false;
    }
}