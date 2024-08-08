package org.example.password

class InvalidPassword : PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.state = if (char.get(0).isLetterOrDigit()) ValidPassword() else InvalidPassword()
    }
}