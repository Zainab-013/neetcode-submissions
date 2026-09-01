class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(Integer i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            // System.out.println("contains duplicate");
            return true;
        }
        else{
           map.put(nums[i],i);
        }
    } 
    return false;
    }
}