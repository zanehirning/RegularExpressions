package password

import org.example.password.PasswordVerifier
import kotlin.test.Test

class PasswordVerifierTest {
    @Test
    fun testVerify() {
        val passwordVerifier = PasswordVerifier()
        assert(passwordVerifier.verify("aaaaH!aa"))
        assert(passwordVerifier.verify("1234567*89J"))
        assert(passwordVerifier.verify("!@#)#@!(fdsaS"))
        assert(!passwordVerifier.verify("1!J"))
        assert(!passwordVerifier.verify("123Jfdskaj!")) // ends with special character
        assert(!passwordVerifier.verify("aaaaaa!aaaa")) // no capitol
        assert(!passwordVerifier.verify("Aaaaaaab!")) // ends with special character
        assert(!passwordVerifier.verify("aaaaaaaaaaa")) // no special character or capitol
    }
}