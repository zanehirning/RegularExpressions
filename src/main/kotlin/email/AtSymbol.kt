package org.example.email

import RegexState
import Verifier

class AtSymbol : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
        verifier.state = if (char == "@" || char == "." || char == " ") InvalidEmail() else SecondPart()
    }
}