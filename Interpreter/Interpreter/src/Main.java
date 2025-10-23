public static void main(String[] args) {
        Expression securityRule = buildSecurityRule();


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
            if (isValid) {
                System.out.println("Contraseña VÁLIDA. Cumple con todas las reglas.");
            } else {
                System.out.println("Contraseña INVÁLIDA. Falla alguna regla de seguridad.");
            }
            System.out.println("-------------------------------------");
        }
    }