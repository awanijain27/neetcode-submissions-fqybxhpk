class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for(String str : tokens) {

            char c = str.charAt(0);

            if(Character.isDigit(c) || str.length() > 1){
                s.push(Integer.parseInt(str));
            }
            else {

                int x = s.pop(), y = s.pop();

                int n = 0;

                if(str.equals("+"))
                    n = y + x;

                else if(str.equals("-"))
                    n = y - x;

                else if(str.equals("*"))
                    n = y * x;

                else
                    n = y / x;

                s.push(n);
            }
        }

        return s.pop();
    }
}