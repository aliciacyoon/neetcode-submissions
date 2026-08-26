class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for (int i = 0; i < strs.size(); i++) {
            String curr = strs.get(i);
            ans += curr.length() + "#";
            ans += curr;
        }
        return ans;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<String>();
        int ind = 0;
        while (ind < str.length()) {
            int j = ind;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(ind, j));
            ind = j + 1;
            j = ind + len;
            ans.add(str.substring(ind, j));
            ind = j;
        }
        return ans;
    }
}
