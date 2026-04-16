class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        // if(nums.length > 0){
        //     for(int i=0; i < nums.length; i++){
        //         for(int j=i+1; j<nums.length; j++){
        //             if(nums[i] == nums[j]) return true;
        //         }
        //     }
        //     return false;
        // }else{
        //     return false;
        // }

HashSet<Integer> hs=new HashSet();
for(Integer i : nums){
    if(hs.contains(i))
        return true;
    else 
        hs.add(i);
}
    return false;

    }

}