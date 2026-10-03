class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<Integer>();

        for (int i = 0; i < tokens.length ; i ++) {
            if ("+-*/".contains(tokens[i])) {
                int num2 = numbers.pop();
                int num1 = numbers.pop();
                if (tokens[i].equals("+")) {
                    num1 += num2;
                } else if (tokens[i].equals("-")) {
                    num1 -= num2;
                } else if (tokens[i].equals("*")) {
                    num1 *= num2;
                } else if (tokens[i].equals("/")) {
                    num1 /= num2;
                }
                numbers.add(num1);
            } else {
                numbers.add(Integer.parseInt(tokens[i]));
            }
        }
        return numbers.peek();
    }
}
