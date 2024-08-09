package org.example.email

import RegexState
import Verifier

class InvalidEmail : RegexState {
    override fun consumeCharacter(char: String, verifier: Verifier) {
    }
}