package interpreterPattern;

public class Number implements Expression{

    private final int NUMBER;

    public Number(int n){
        this.NUMBER = n;
    }
    
    @Override
    public int interpret() {
        return NUMBER;
    }

}

