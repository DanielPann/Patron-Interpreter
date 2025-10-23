public class Main {

    public static void main(String[] args) {
        Expression securityRule = Interpreter.buildSecurityRule();

        String[] passwords = {
            "ValidP4ss!",
            "short4",
            "minusculas123",
            "PasswordLargo"
        };

        for (String pwd : passwords) {
            System.out.printf("%n// VALIDANDO: \"%s\"%n", pwd);
            boolean isValid = securityRule.interpret(pwd);

            System.out.println("-------------------------------------");
            System.out.println(isValid ?
                "Contraseña VÁLIDA. Cumple con todas las reglas." :
                "Contraseña INVÁLIDA. Falla alguna regla de seguridad.");
            System.out.println("-------------------------------------");
        }
    }
}
