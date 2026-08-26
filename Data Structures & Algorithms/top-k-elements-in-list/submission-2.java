class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }

        List<Integer>[] buck = new ArrayList[nums.length + 1];
        for (int i = 0; i < buck.length; i++) {
            buck[i] = new ArrayList<Integer>();
        }

        for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            int value = entry.getKey();
            int frequency = entry.getValue();
            buck[frequency].add(value);
        }

        int[] ans = new int[k];
        int ind = 0;

        for (int i = nums.length  ; i >= 0; i --) {
            for (int j: buck[i]) {
                ans[ind] = j;
                ind ++;
                if (ind >= k) {
                    return ans;
                }
            }
            
        }
        return ans;
    }
}
