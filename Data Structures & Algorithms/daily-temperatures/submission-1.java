class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<int[]> temps = new Stack<>(); //pair -> temp, index

        for (int i = 0; i < temperatures.length; i++) {
            //for each temperature index
            while (temps.size() != 0 && temperatures[i] > temps.peek()[0]) {
                int[] prev = temps.pop(); //temperature is less, ind less too
                ans[prev[1]] = i - prev[1]; //since this curr temperature is higher than prev and this one hasnt found one yet that is higher temp
                //add it to the ans and pop now that its found
            }
            temps.push(new int[]{temperatures[i], i});
        }
        return ans;
        

    }
}
