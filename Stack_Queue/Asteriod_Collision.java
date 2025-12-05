// LeetCode 735 // 

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();

        for(int curr : asteroids){

            boolean alive = true;

           

     while(alive && curr < 0 && !stack.isEmpty() && stack.peek() > 0){
                 int top = stack.peek();

                if(Math.abs(top) < Math.abs(curr)){
                    stack.pop();
                }
            else if(Math.abs(top) == Math.abs(curr)){
            stack.pop();
            alive = false;
            }
            else{
                alive = false; 
            }
        }
            // still the asteriod surivies all collions
            if(alive){
                stack.push(curr);
            }
        }

        // convert the stack into array

        int[] result = new int[stack.size()];
        for(int i=0; i<stack.size() ; i++){
            result[i] = stack.get(i);
        }

        return result;
    }
}