package pattern.behavioral.interpreter;

public class InterpreterClient {

    InterpreterContext ic;

    public InterpreterClient(InterpreterContext ic) {
        this.ic = ic;
    }

    public String interpret(String str) {
        Integer i = Integer.valueOf(str.split(" ")[0]);

        if (str.contains("binary")) {
            return new IntToBinaryExpression(i).interpret(ic);
        } else {
            return new IntToHexaExpression(i).interpret(ic);
        }

    }
}
