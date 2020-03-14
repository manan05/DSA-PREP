class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2]; //creating a new array to save the output indices
        for(int i = 0; i<nums.length;i++){ 
            for(int j = i+1;j<nums.length;j++){ //starting from the next element that is (i+1)
                if(nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr; //if nothing happens then we return the arr as it is.
    }
    
}
