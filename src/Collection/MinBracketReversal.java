package Collection;

import java.util.Stack;

public class MinBracketReversal {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
       for (char c:s.toCharArray()){
           if (c=='{'||c=='['||c=='('){
               stack.push(c);
           }
           else if (c=='}'||c==']'||c==')'){
               if (stack.isEmpty()){
                   return false;
               }
               char top=stack.pop();
               if ((c == '}' && top != '{') ||
                       (c == ']' && top != '[') ||
                       (c == ')' && top != '(')) {
                   return false;
               }

           }
       }
       return stack.isEmpty();
    }

    static void main() {
        String s1 = "{[()]}";
        String s2 = "{[(])}";

        System.out.println(s1 + " -> " + (isBalanced(s1) ? "Balanced" : "Not Balanced"));
        System.out.println(s2 + " -> " + (isBalanced(s2) ? "Balanced" : "Not Balanced"));
    }
}
