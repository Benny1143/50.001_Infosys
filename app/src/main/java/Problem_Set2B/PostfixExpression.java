package Problem_Set2B;

public class PostfixExpression extends FixExpression {

    public static void main(String[] args) {

        FixExpression f1 = new PostfixExpression("12+");
        System.out.println(f1.evaluateExpression()); //3

        FixExpression f2 = new PostfixExpression("234*+");
        System.out.println(f2.evaluateExpression()); //14

        FixExpression f3 = new PostfixExpression("1");
        System.out.println(f3.evaluateExpression()); // 1

        System.out.println(new PostfixExpression("34*25*+").evaluateExpression()); // 22
        System.out.println(new PostfixExpression("").evaluateExpression()); // -2147483648
        System.out.println(new PostfixExpression("a").evaluateExpression()); // -2147483648
    }

    public PostfixExpression(String expression){
        super(expression);
    }

    @Override
    public int evaluateExpression(){
        if (!isValidString() || getExpression().isEmpty()) {
            return Integer.MIN_VALUE;
        }
        StackImpl<Integer> s = new StackImpl<Integer>();
        for(char c: getExpression().toCharArray()) {
            if (isOperand(c)) {
                s.push(Character.getNumericValue(c));
            } else {
                int p1 = s.pop();
                int p2 = s.pop();
                int p3 = getValue(p1, p2, c);
                s.push(p3);
            }
        }
        return s.pop();
    }

    private boolean isOperator(char c) {
        return "+-*/".indexOf(c) != -1;
    }

    private boolean isOperand(char c) {
        return "0123456789".indexOf(c) != -1;
    }

    private int getValue(int p1, int p2, char c) {
        switch (c) {
            case '+':
                return p2 + p1;
            case '-':
                return p2 - p1;
            case '*':
                return p2 * p1;
            case '/':
                return p2 / p1;
            default:
                return 0;
        }
    }
}
