// LeetCode  118 // 

class Solution {
    public List<List<Integer>> generate(int numRows) {
          List<List<Integer>> result = new ArrayList<>();

for(int i=0 ; i < numRows; i++){ 
        List<Integer> row = new ArrayList<>();
     
        row.add(1);

// middle element
      for(int j = 1; j < i; j++){
// formula to cal the mid from left and right
  int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
               row.add(val);
        } 
        if(i > 0)
            row.add(1);
            result.add(row);
        
}
       return result; 
    }
}