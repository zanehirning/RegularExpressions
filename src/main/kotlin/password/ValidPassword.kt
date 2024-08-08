package org.example.password

class ValidPassword : PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.state = if (char in "(!@#$%&*)") InvalidPassword() else ValidPassword()
    }
}