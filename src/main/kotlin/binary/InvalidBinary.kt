package org.example.binary

import RegexState
import Verifier

class InvalidBinary : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        // do nothing
    }
}