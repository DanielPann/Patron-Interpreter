public class OrExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public OrExpression(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    public boolean interpret(String password) {
        boolean leftResult = leftExpression.interpret(password);
        boolean rightResult = rightExpression.interpret(password);
        
        return leftResult || rightResult;
    }
}
