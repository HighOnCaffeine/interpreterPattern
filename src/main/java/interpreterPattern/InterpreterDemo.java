package interpreterPattern;
import java.util.Stack;

public class InterpreterDemo {
    public static void main(String[] args) {
        String tokenString = "7 4 - 2 1 + /";
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = tokenString.split(" ");
        for (String s : tokenArray) {
            if (InterpreterContext.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = InterpreterContext.getOperator(s, leftExpression,rightExpression);
                int result = operator.interpret();
                stack.push(new Number(result));
            } else {
                Expression i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }
        System.out.println("postfix( "+tokenString+" ) = "+stack.pop().interpret());
    }
}

