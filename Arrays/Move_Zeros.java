// LeetCode 283 //

class Solution {
    public void moveZeroes(int[] nums) {
        
        // use 2 pointer app

        int slow = 0 ;

        for(int i=0 ; i<nums.length; i++){
           
           // arrange all Non-Zero elements first
            if(nums[i] != 0){
                nums[slow] = nums[i];
                slow++;
            }
        }
            // Now Arrange all Zero's at the end 
// and the very next place after non-zero elem is empty fill from there

             while(slow < nums.length){
                nums[slow] = 0;
                slow++;
             }
        

    }
}