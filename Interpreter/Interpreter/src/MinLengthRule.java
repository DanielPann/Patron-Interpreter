public class MinLengthRule implements Expression {
    private final int minLength;

    public MinLengthRule(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean interpret(String password) {
        boolean result = password.length() >= minLength;
        System.out.printf("  [Regla Longitud (>= %d)] -> %s%n", minLength, result ? "Pasa" : "Falla");
        return result;
    }
}
