package pattern.behavioral.interpreter;

public class IntToBinaryExpression implements Expression {

    private Integer i;

    public IntToBinaryExpression(Integer i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinary(i);
    }
}
