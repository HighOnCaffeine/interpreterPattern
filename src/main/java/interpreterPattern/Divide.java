package interpreterPattern;

public class Divide implements Expression{
	
    private final Expression LEFT_EXPRESSION;
    private final Expression RIGHT_EXPRESSION;

    public Divide(Expression leftExpression,Expression rightExpression ){
        this.LEFT_EXPRESSION = leftExpression;
        this.RIGHT_EXPRESSION = rightExpression;
    }
    @Override
    public int interpret() {
        return LEFT_EXPRESSION.interpret() / RIGHT_EXPRESSION.interpret();
        // int value will be returned instead of float
        // because of datatype restriction
    }

}
