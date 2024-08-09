package org.example.floats

import RegexState
import Verifier

class Integer : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        if (char in "0123456789") {
            verifier.state = Integer()
        }
        else if (char == ".") {
            verifier.state = Period()
        }
        else {
            verifier.state = InvalidFloat()
        }
    }
}