package org.example.binary

import RegexState
import Verifier

class FirstBinary : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char == "1") ValidBinary() else InvalidBinary()
    }
}