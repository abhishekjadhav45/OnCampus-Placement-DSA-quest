// LeetCode 442 // 

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        // store result 

        List<Integer> result = new ArrayList<>();

        // use for ech loop

        for(int num : nums){

            int index = Math.abs(num) -1 ;

            if(nums[index] < 0){
                result.add(Math.abs(num));
            }else{
                nums[index] = -nums[index];
            }
        }
        return result;
    }
}