package org.example.binary

import RegexState
import Verifier

open class Zero : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        if (char == "1") {
            verifier.state = ValidBinary()
        } else if (char == "0") {
            verifier.state = Zero()
        } else {
            verifier.state = InvalidBinary()
        }
    }
}