package interpreterPattern;

public class Substract implements Expression{
	
    private final Expression LEFT_EXPRESSION;
    private final Expression RIGHT_EXPRESSION;

    public Substract(Expression leftExpression,Expression rightExpression ){
        this.LEFT_EXPRESSION = leftExpression;
        this.RIGHT_EXPRESSION = rightExpression;
    }
    @Override
    public int interpret() {
        return LEFT_EXPRESSION.interpret() - RIGHT_EXPRESSION.interpret();
    }

}
