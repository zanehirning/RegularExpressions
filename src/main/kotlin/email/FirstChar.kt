package org.example.email

import RegexState
import Verifier

class FirstChar : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        if (char == "@" || char == " " || char == ".") {
            verifier.state = InvalidEmail()
        } else {
            verifier.state = FirstPart()
        }
    }
}