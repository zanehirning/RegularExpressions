package org.example.password

import RegexState
import Verifier

class ValidPassword : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char in "(!@#$%&*)") InvalidPassword() else ValidPassword()
    }
}