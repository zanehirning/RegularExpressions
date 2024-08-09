package email

import Verifier
import enums.RegexType
import kotlin.test.Test

class EmailVerifierTest {
    @Test
    fun testVerify() {
        var emailVerifier = Verifier()
        assert(emailVerifier.verify("test@usu.edu", RegexType.EMAIL))
        assert(emailVerifier.verify("{}{:@,;.4932'';", RegexType.EMAIL))
        assert(emailVerifier.verify("abc.abc@abc.com", RegexType.EMAIL))
        assert(emailVerifier.verify("a@b.c", RegexType.EMAIL))
        assert(!emailVerifier.verify("a@b@.c", RegexType.EMAIL))
        assert(!emailVerifier.verify("abc@abc.com.", RegexType.EMAIL))
        assert(!emailVerifier.verify("abc@abc.com@com.", RegexType.EMAIL))
        assert(!emailVerifier.verify("abc abc@abc.com", RegexType.EMAIL))
        assert(!emailVerifier.verify("abc.abc@a.bc.com", RegexType.EMAIL))
        assert(!emailVerifier.verify("abc@ abc. com", RegexType.EMAIL))
        assert(!emailVerifier.verify("", RegexType.EMAIL))
    }
}