package org.example.integer

import RegexState
import Verifier

class FirstInteger : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char in "123456789") ValidInteger() else InvalidInteger()
    }
}