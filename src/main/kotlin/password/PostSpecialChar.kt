package password

import RegexState
import Verifier

class PostSpecialChar : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char.get(0).isUpperCase()) ValidPassword() else PostSpecialChar()
    }
}