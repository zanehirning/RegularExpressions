package org.example.email

class SecondPart : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        if (char == ".") {
            emailVerifier.state = Period()
        }
        else if (char == "@" || char == " ") {
            emailVerifier.state = InvalidEmail()
        }
        else {
            emailVerifier.state = SecondPart()
        }
    }
}