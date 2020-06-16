package interpreterPattern;

public class InterpreterContext {
    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
    public static Expression getOperator(String s, Expression left,	Expression right) {
        switch (s) {
        case "+":
            return new Add(left, right);
        case "-":
            return new Substract(left, right);
        case "*":
            return new Product(left, right);
        case "/":
            return new Divide(left, right);       
        default:
            System.out.println("Wrong Operator or Number\n");
        }
        return null;
    }
}

