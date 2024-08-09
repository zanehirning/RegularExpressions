package org.example.integer

import RegexState
import Verifier

class InvalidInteger : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        // Do nothing
    }
}