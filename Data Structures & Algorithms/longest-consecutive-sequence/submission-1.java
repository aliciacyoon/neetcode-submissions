class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashMap = new HashSet<>();
        for (int num: nums) {
            hashMap.add(num);
        }
        int longest = 0;

        for (int num: hashMap) {
            if (!hashMap.contains(num - 1)) {
                int len = 1;
                while (hashMap.contains(num + len)) {
                    len ++;
                }
                longest = Math.max(len, longest);
            }
        }
        return longest;
    }
}
