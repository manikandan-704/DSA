package Stack;

import java.util.Stack;

public class ValidPara {
    static void main(String[] args) {
    String s= "([])";
    boolean result=validParenthesis(s);
        System.out.println(result);
    }
    static Boolean valid(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '('){
                stack.push(')');
            } else if (c=='{') {
                stack.push('}');
            } else if (c=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    static boolean validParenthesis(String s){
        StringBuilder sb = new StringBuilder(s);

        int i = 0;

        while (i < sb.length() - 1) {
            char a = sb.charAt(i);
            char b = sb.charAt(i + 1);

            if ((a == '(' && b == ')') ||
                    (a == '{' && b == '}') ||
                    (a == '[' && b == ']')) {

                sb.delete(i, i + 2);

                // Move back one position if possible
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }

        return sb.isEmpty();
    }
}
