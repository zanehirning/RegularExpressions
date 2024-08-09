package org.example.password

import RegexState
import Verifier

class InvalidPassword : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char.get(0).isLetterOrDigit()) ValidPassword() else InvalidPassword()
    }
}