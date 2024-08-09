package org.example.email

import RegexState
import Verifier

class FirstPart : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        if (char == "@") {
            verifier.state = AtSymbol()
        }
        else if (char == " ") {
            verifier.state = InvalidEmail()
        }
        else {
            verifier.state = FirstPart()
        }
    }
}