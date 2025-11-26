class Solution {
    public int majorityElement(int[] nums) {

        int party = 0;
        int vote = 0;

        for(int num : nums){

            if(vote == 0){ // vote bec 0 take next elem
                party = num;
            }
            if(num == party){// curr elem = next elem increase vote
                vote++;

            }else{  // curr elem not eq to next elem dec the vote of the 
                    // majority   elem  
                vote--;
            }
        }
        return party;
    }
}