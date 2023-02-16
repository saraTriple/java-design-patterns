package src.interpretor;

public class AndExpression implements Expression{
    private Expression expression = null;
    private Expression expression2 = null;

    public AndExpression(Expression expression, Expression expression2) {
        this.expression = expression;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression.interpret(context) && expression2.interpret(context);
    }
}
