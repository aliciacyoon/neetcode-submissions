class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++ ) {
            if (counts.containsKey(nums[i])) {
                counts.put(nums[i], counts.get(nums[i]) + 1);
            } else {
                counts.put(nums[i], 1);
            }
        }
        //ok rn i have the counts and everyhting in a hashmap
        List<Integer>[] bucket = new List[nums.length + 1]; //for the frequencies
        for(int i =0 ; i < nums.length + 1; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            bucket[value].add(key);
        }
        //now by frequencies
        int[] ans = new int[k];
        int ind = 0;
        for (int i = bucket.length - 1; i >=0; i--) {
            for (int j : bucket[i]) { 
                ans[ind++] = j;
                if (ind == k) {
                    return ans;
                }
            }
            
        }
        return ans;
    }
    
}
