class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length + 1]; //i want the first one to be 1 to make it easier..?
        prefix[0] = 1;
        int[] suffix = new int[nums.length + 1]; //same thing, last one be 1
        suffix[suffix.length - 1] = 1; //can do these presets bc 2<= nums.length
        for (int i = 0; i < nums.length; i ++) { 
            prefix[i + 1] = prefix[i] * nums[i];
        }

        for (int i = 0; i < nums.length; i ++) { 
            suffix[suffix.length - 2 - i] = suffix[suffix.length - 1 - i] * nums[nums.length - 1 - i];
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix[i] * suffix[i + 1];
        }

        return ans;

    }
}  
