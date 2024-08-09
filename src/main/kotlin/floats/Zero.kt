package org.example.floats

import RegexState
import Verifier

class Zero : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char == ".") Period() else InvalidFloat()
    }
}