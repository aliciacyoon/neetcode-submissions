class Solution {
    public int removeElement(int[] nums, int val) {
        int pointerOne = 0;
        int pointerTwo = nums.length ;
        while (pointerOne < pointerTwo) {
            if (nums[pointerOne] == val) {
                nums[pointerOne] = nums[--pointerTwo];
            }
            else{
                pointerOne++;
            } 
        }
        return pointerTwo;
    }
}