package org.example.binary

class FirstBinary : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        binaryVerifier.state = if (char == "1") ValidBinary() else InvalidBinary()
    }
}