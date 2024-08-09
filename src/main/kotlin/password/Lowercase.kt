package password

import RegexState
import Verifier
import org.example.password.*

class Lowercase : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        if (char in "(!@#$%&*)") {
            verifier.state = PostSpecialChar()
        }
        if (char.get(0).isLetterOrDigit()) {
            verifier.state = Lowercase()
        }
        if (char.get(0).isUpperCase()) {
            verifier.state = PostCapitol()
        }
    }
}