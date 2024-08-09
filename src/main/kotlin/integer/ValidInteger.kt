package org.example.integer

import RegexState
import Verifier

class ValidInteger : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char in "0123456789") ValidInteger() else InvalidInteger()
    }
}