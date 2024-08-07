package org.example.binary

class Zero : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char == "1") {
            binaryVerifier.state = ValidBinary()
        }
        else if (char == "0") {
            binaryVerifier.state = this
        }
        else {
            binaryVerifier.state = InvalidBinary()
        }
    }
}