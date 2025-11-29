class Solution {
    public int maxSubArray(int[] nums) {

        int CurrSum = 0 ;
        int MaxSum = nums[0];

        // go by For Each loop

        for(int num : nums){

            CurrSum = CurrSum + num;  // go through each element

            // Update MaxSum 

            MaxSum = Math.max(MaxSum , CurrSum);


         // if CurrSum becomes - Negative reset to 0 and start next elem

         if(CurrSum < 0){
            CurrSum = 0;
         }



        }
        return MaxSum;
        
    }
}