
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Suite de testes do PasswordValidator.
 * Cada teste segue o padrão AAA: Arrange / Act / Assert
 *
 * Requisitos testados:
 * - mínimo 8 caracteres
 * - pelo menos 1 número
 * - pelo menos 1 letra maiúscula
 * - pelo menos 1 caractere especial (@#$%^&+=)
 * - comportamento para null (lança IllegalArgumentException)
 *
 * Recomenda-se seguir o fluxo TDD:
 * 1) escrever o teste (RED) -> rodar: falha
 * 2) implementar o mínimo (GREEN) -> rodar: passa
 * 3) refatorar mantendo testes verdes (REFACTOR)
 */
class PasswordValidatorTest {

    @Test
    void deveRejeitarSenhaCurta() {
        // Arrange
        String senhaCurta = "Ab1@"; // < 8 caracteres

        // Act
        boolean resultado = PasswordValidator.isValid(senhaCurta);

        // Assert
        assertFalse(resultado, "Senhas com menos de 8 caracteres devem ser inválidas");
    }

    @Test
    void deveLancarExcecaoParaSenhaNula() {
        // Arrange & Act & Assert
        Exception ex = assertThrows(IllegalArgumentException.class, () -> PasswordValidator.isValid(null));
        // Mensagem esperada documentada no código de produção
        assertEquals("Senha não pode ser nula", ex.getMessage());
    }

    @Test
    void deveRejeitarSenhaSemDigito() {
        // Arrange: tem maiúscula e especial, tamanho ok, mas falta dígito
        String senha = "Abcdefg@H";

        // Act
        boolean resultado = PasswordValidator.isValid(senha);

        // Assert
        assertFalse(resultado, "Senha sem dígito deve ser inválida");
    }

    @Test
    void deveRejeitarSenhaSemMaiuscula() {
        // Arrange: tem dígito e especial e tamanho ok, mas sem maiúscula
        String senha = "abcde1@2f";

        // Act
        boolean resultado = PasswordValidator.isValid(senha);

        // Assert
        assertFalse(resultado, "Senha sem letra maiúscula deve ser inválida");
    }

    @Test
    void deveRejeitarSenhaSemCaracterEspecial() {
        // Arrange: tem maiúscula e dígito, tamanho ok, mas sem caractere especial
        String senha = "Abcdef12";

        // Act
        boolean resultado = PasswordValidator.isValid(senha);

        // Assert
        assertFalse(resultado, "Senha sem caractere especial deve ser inválida");
    }

    @Test
    void deveAceitarSenhaValida() {
        // Arrange: atende a todos os requisitos
        String senhaValida = "Abcde1@2";

        // Act
        boolean resultado = PasswordValidator.isValid(senhaValida);

        // Assert
        assertTrue(resultado, "Senha que atende a todos os requisitos deve ser válida");
    }
}