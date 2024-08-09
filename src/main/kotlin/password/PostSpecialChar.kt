package password

import RegexState
import Verifier
import org.example.password.ValidPassword

class PostSpecialChar : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char.get(0).isUpperCase()) ValidPassword() else PostSpecialChar()
    }
}