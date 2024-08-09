package password

import org.example.password.InvalidPassword
import org.example.password.PasswordState
import org.example.password.PasswordVerifier

class PostCapitol : PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.state = if (char in "(!@#$%&*)") InvalidPassword() else PostCapitol()
    }
}