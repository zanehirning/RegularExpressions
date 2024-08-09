package org.example.floats

import RegexState
import Verifier

class ValidFloat : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        if (char !in "0123456789") {
            verifier.state = InvalidFloat()
        }
    }
}