package pattern.behavioral.interpreter;

public class IntToHexaExpression implements Expression {

    private Integer i;

    public IntToHexaExpression(Integer i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexa(i);
    }
}
