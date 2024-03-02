package Problem_Set2B;

public abstract class FixExpression {
    private String expression;
    private String validChars = "0123456789+-*/";

    // you may encounter issues if this is not declared public
    public FixExpression(String expression){
        this.expression = expression;
    }

    // complete this method
    public boolean isValidString(){
        for(char c: expression.toCharArray()) {
            if(validChars.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }

    public String getExpression() {
        return expression;
    }

    public String getValidChars() {
        return validChars;
    }

    public abstract int evaluateExpression();
}
