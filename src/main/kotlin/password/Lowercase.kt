package password

import org.example.password.*

class Lowercase : PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in "(!@#$%&*)") {
            passwordVerifier.state = PostSpecialChar()
        }
        if (char.get(0).isLetterOrDigit()) {
            passwordVerifier.state = Lowercase()
        }
        if (char.get(0).isUpperCase()) {
            passwordVerifier.state = PostCapitol()
        }
    }
}