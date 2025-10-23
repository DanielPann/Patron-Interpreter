import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberRule {
    private static final Pattern PATTERN = Pattern.compile(".*\\d.*");

    public boolean interpret(String password) {
        Matcher matcher = PATTERN.matcher(password);
        boolean result = matcher.matches();
        System.out.printf("  [Regla Número] -> %s%n", result ? "Pasa" : "Falla");
        return result;
    }
}
