package org.example.floats

import RegexState
import Verifier

class FirstDigit : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        if (char == "0") {
            verifier.state = Zero()
        }
        else if (char in "123456789") {
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