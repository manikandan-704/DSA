package Stack;

import java.util.Stack;

public class ValidPara {
    static void main(String[] args) {
    String s= "([])";
    boolean result=valid(s);
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
}
