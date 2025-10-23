import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperCaseRule {
    private static final Pattern PATTERN = Pattern.compile(".*[A-Z].*");

    public boolean interpret(String password) {
        Matcher matcher = PATTERN.matcher(password);
        boolean result = matcher.matches();
        System.out.printf("  [Regla Mayúscula] -> %s%n", result ? "Pasa" : "Falla");
        return result;
    }
}
