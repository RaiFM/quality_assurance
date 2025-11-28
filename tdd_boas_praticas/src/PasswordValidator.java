
public class PasswordValidator {

    // Conjunto de caracteres especiais aceitos
    private static final String SPECIALS = "@#$%^&+=";

    /**
     * Valida a senha segundo os requisitos:
     * - não nula (lança IllegalArgumentException)
     * - pelo menos 8 caracteres
     * - pelo menos 1 dígito
     * - pelo menos 1 letra maiúscula
     * - pelo menos 1 caractere especial (da lista SPECIALS)
     *
     * @param password senha a validar
     * @return true se a senha atende a todos os requisitos; false caso contrário
     * @throws IllegalArgumentException se password for null
     */
    public static boolean isValid(String password) {
        if (password == null) throw new IllegalArgumentException("Senha não pode ser nula");
        if (password.length() < 8) return false;

        return hasDigit(password) && hasUpper(password) && hasSpecial(password);
    }

    private static boolean hasDigit(String s) {
        for (char c : s.toCharArray()) if (Character.isDigit(c)) return true;
        return false;
    }

    private static boolean hasUpper(String s) {
        for (char c : s.toCharArray()) if (Character.isUpperCase(c)) return true;
        return false;
    }

    private static boolean hasSpecial(String s) {
        for (char c : s.toCharArray()) if (SPECIALS.indexOf(c) >= 0) return true;
        return false;
    }
}