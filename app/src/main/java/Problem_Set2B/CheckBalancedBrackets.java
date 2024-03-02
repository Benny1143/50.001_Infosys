package Problem_Set2B;

public class CheckBalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isOpenBracket('('));
        System.out.println( isOpenBracket('a'));
        System.out.println(isCloseBracket(']'));
        System.out.println(isCloseBracket('a'));
        System.out.println( isMatchBracket('(',')'));
        System.out.println( isMatchBracket('a','a'));
        System.out.println(isBalancedBrackets("()[]()"));
        System.out.println(isBalancedBrackets("([]())"));
        System.out.println(isBalancedBrackets("([]())(()"));
    }

    public static boolean isBalancedBrackets( String expression ){
        StackImpl<Character> s = new StackImpl<Character>();
        for(char c: expression.toCharArray()) {
            if(isOpenBracket(c)) {
                s.push(c);
            } else if (isCloseBracket(c)) {
                char d = s.pop();
                if(!isMatchBracket(d, c)) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean isOpenBracket( char c){
        String brackets = "({[";
        return brackets.indexOf(c) != -1;
    }

    public static boolean isCloseBracket(char c){
        String brackets = ")}]";
        return brackets.indexOf(c) != -1;
    }

    public static boolean isMatchBracket(char a, char b){
        return isOpenBracket(a) && isCloseBracket(b);
    }
}
