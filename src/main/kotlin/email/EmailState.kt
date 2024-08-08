package org.example.email

interface EmailState {
fun consumeCharacter(char: String, emailVerifier: EmailVerifier)
}