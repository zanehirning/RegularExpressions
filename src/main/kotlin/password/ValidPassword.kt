package password

import RegexState
import Verifier
import org.example.password.InvalidPassword

class ValidPassword : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char in "(!@#$%&*)") InvalidPassword() else ValidPassword()
    }
}