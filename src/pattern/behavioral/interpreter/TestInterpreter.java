package pattern.behavioral.interpreter;

public class TestInterpreter {

    public static void main(String[] args) {
        InterpreterClient client = new InterpreterClient(new InterpreterContext());

        String binary = client.interpret("28 in binary");
        String hexa = client.interpret("28 in hexa");

        System.out.println("binary:: " + binary);
        System.out.println("hexa:: " + hexa);
    }
}
