package password

import org.example.password.PasswordState
import org.example.password.PasswordVerifier
import org.example.password.ValidPassword

class PostSpecialChar : PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.state = if (char.get(0).isUpperCase()) ValidPassword() else PostSpecialChar()
    }
}