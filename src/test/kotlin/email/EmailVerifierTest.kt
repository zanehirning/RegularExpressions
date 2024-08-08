package email

import org.example.email.EmailVerifier
import kotlin.test.Test

class EmailVerifierTest {
    @Test
    fun testVerify() {
        var emailVerifier = EmailVerifier()
        assert(emailVerifier.verify("test@usu.edu"))
        assert(emailVerifier.verify("{}{:@,;.4932'';"))
        assert(emailVerifier.verify("abc.abc@abc.com"))
        assert(emailVerifier.verify("a@b.c"))
        assert(!emailVerifier.verify("a@b@.c"))
        assert(!emailVerifier.verify("abc@abc.com."))
        assert(!emailVerifier.verify("abc@abc.com@com."))
        assert(!emailVerifier.verify("abc abc@abc.com"))
        assert(!emailVerifier.verify("abc.abc@a.bc.com"))
        assert(!emailVerifier.verify("abc@ abc. com"))
        assert(!emailVerifier.verify(""))
    }
}