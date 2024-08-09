package org.example.email

import RegexState
import Verifier

class SecondPart : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        if (char == ".") {
            verifier.state = Period()
        }
        else if (char == "@" || char == " ") {
            verifier.state = InvalidEmail()
        }
        else {
            verifier.state = SecondPart()
        }
    }
}