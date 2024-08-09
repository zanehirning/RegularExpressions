package password

import RegexState
import Verifier
import org.example.password.InvalidPassword

class PostCapitol : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char in "(!@#$%&*)") InvalidPassword() else PostCapitol()
    }
}