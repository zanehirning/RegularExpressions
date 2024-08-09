package org.example.floats

import RegexState
import Verifier

class Period : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char in "0123456789") ValidFloat() else InvalidFloat()
    }
}